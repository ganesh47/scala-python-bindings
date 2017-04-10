import sbt.Keys.javaOptions

organization := "me.shadaj"

name := "scalapy-tensorflow"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.1"


lazy val scalaReflect = Def.setting {
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
}

lazy val arch = if (System.getProperty("os.arch").equals("amd64")) "x64" else "x86"

lazy val os = System.getProperty("os.name").split(" ")(0).toLowerCase

lazy val jep = project in file("jep_" + os + "_" + arch) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val scalapy = project in file("scalapy") dependsOn jep settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val numpy = project in file("scala-numpy") dependsOn scalapy settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val root = project in file(".") dependsOn(numpy, scalapy) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val requirements = Seq("jep", "tensorflow", "pandas")

lazy val commandLinePython = if(os.startsWith("win")) "python" else "python3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in runMain := true
fork in run in Test := true

javaOptions in run in Test += "-Djava.library.path=./lib/"
javaOptions in runMain += "-Djava.library.path=./lib/"

update <<= update map {
  report =>
    import sys.process._
    requirements.foreach {
      req=>("pip3 install " + req).!
    }
    println((commandLinePython +" --version").!)
    val expandedCommandLine = commandLinePython + " -c \"from distutils.sysconfig import get_python_lib; print(get_python_lib())\""
    println(expandedCommandLine)
    println(expandedCommandLine.!)
    lazy val otp = expandedCommandLine.!!
    lazy val path = otp.trim().replace('\\','/').replaceAll("\n", "")+"/jep"
    lazy val jepJar = IO.listFiles(new File(path)).map { x => println(x.name); x }.filter(_.name.endsWith("jar"))
    lazy val jepLib = new File(project.base, "jep_" + os ++ "_" + arch + "/lib/")
    jepLib.mkdirs()
    IO.copy(Seq((jepJar.head, jepLib)))
    lazy val endNameForSlib = if (os.startsWith("win")) "dll" else "so"
    IO.copy(Seq((IO.listFiles(new File(path)).filter(_.name.endsWith(endNameForSlib)).head, jepLib)))
    report
}