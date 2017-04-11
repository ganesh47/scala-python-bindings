import java.nio.file.Files

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

lazy val jep_deps = "jep_deps"

lazy val jep = project in file(jep_deps) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val scalapy = project in file("scalapy") dependsOn jep settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val numpy = project in file("scala-numpy") dependsOn scalapy settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val root = project in file(".") dependsOn(numpy, scalapy) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val requirements = Seq("numpy","jep", "tensorflow", "pandas")

lazy val commandLinePython = if (os.startsWith("win")) "python" else "python3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

concurrentRestrictions in Global += Tags.limit(Tags.Test, 1)
parallelExecution in ThisBuild := false
update <<= update map {
  report =>
    val sharedObject = if (os.startsWith("win")) "jep.dll" else "libjep.so"

    if (!new File(s"./$jep_deps/lib/$sharedObject").exists()) {
      import sys.process._
      requirements.foreach {
        req => ("pip3 install " + req).!
      }
      println((commandLinePython + " --version").!)
      val pyCode = "import os,pandas ; print(os.path.abspath(pandas.__file__))"

      lazy val otp = IO.withTemporaryFile("pyCode", "py") { file =>
        IO.write(file, pyCode.getBytes)
        (commandLinePython + " " + file.getAbsolutePath) !!
      }
      lazy val path = otp.trim().replace('\\', '/').replaceAll("\n", "").replaceAll(".pandas.__init__.py","") + "/jep"
      val code =
        s"""
           |import shutil, glob
           |dest_dir = r"$jep_deps/lib/"
           |for f in glob.glob('$path/jep*.jar'):
           |	shutil.copy(f, dest_dir)
           |for f in glob.glob('$path/$sharedObject'):
           |	shutil.copy(f, dest_dir)
    """.stripMargin

      lazy val result = IO.withTemporaryFile("pyCode2", "py") { file =>
        IO.write(file, code.getBytes)
        println(code)
        println(file.getAbsolutePath)
        println((commandLinePython + " " + file.getAbsolutePath) !!)
        (commandLinePython + " " + file.getAbsolutePath) !
      }
      if (result > 0) throw new Exception(" Error running code " + code)
    }
    report
}