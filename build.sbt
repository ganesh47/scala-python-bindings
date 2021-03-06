import java.nio.file.Files

import sbt.Keys.javaOptions

organization := "scala.py"

name := "scala.py-interop"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.1"


lazy val scalaReflect = Def.setting {
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
}

lazy val typesafeLogger = Def.setting {
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
}

lazy val sl4jlogback = Def.setting {
  "ch.qos.logback" % "logback-classic" % "1.1.7"
}


lazy val arch = if (System.getProperty("os.arch").equals("amd64")) "x64" else "x86"

lazy val os = System.getProperty("os.name").split(" ")(0).toLowerCase

lazy val jep_deps = "jep_deps"

lazy val jep = project in file(jep_deps) settings(scalaVersion := "2.12.1",
  libraryDependencies ++= Seq(scalaReflect.value, typesafeLogger.value, sl4jlogback.value))

lazy val scalapy = project in file("scalapy") dependsOn jep settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val numpy = project in file("scala-numpy") dependsOn scalapy settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val root = project in file(".") dependsOn(numpy, scalapy) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

val tensorflow = if (os.startsWith("win")) "tensorflow" else "--upgrade https://storage.googleapis.com/tensorflow/linux/cpu/tensorflow-1.0.1-cp34-cp34m-linux_x86_64.whl"
lazy val requirements = Seq("numpy==1.12.1", "jep", "pandas==0.19.2", tensorflow)

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
      val pyCode = "import os,tensorflow ; print(os.path.abspath(tensorflow.__file__))"

      lazy val otp = IO.withTemporaryFile("pyCode", "py") { file =>
        IO.write(file, pyCode.getBytes)
        (commandLinePython + " " + file.getAbsolutePath) !!
      }
      lazy val path = new File(otp.trim().replace('\\', '/').replaceAll("\n", "")).getParentFile.getParentFile.getAbsolutePath.replace('\\', '/').trim + "/jep"
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