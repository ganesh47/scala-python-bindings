import sbt.Keys.javaOptions

organization := "me.shadaj"

name := "scalapy-tensorflow"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.1"


lazy val scalaReflect = Def.setting {
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
}

lazy val scalapy = project in file("scalapy") settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val numpy = project in file("scala-numpy") dependsOn scalapy settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)

lazy val root = project in file(".") dependsOn(numpy, scalapy) settings(scalaVersion := "2.12.1", libraryDependencies += scalaReflect.value)


libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in runMain := true
fork in run in Test := true

javaOptions in run in Test += "-Djava.library.path=./lib/"
javaOptions in runMain += "-Djava.library.path=./lib/"

