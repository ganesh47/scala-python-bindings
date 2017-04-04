import sbt.Keys.javaOptions

organization := "me.shadaj"

name := "scalapy-tensorflow"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.1"

fork in runMain := true
fork in run in Test := true



lazy val jeb_windows_x64 = project in file("jep_windows_x64") settings Seq(
  javaOptions in Test += "-Djava.library.path= lib/",
  javaOptions in runMain += "-Djava.library.path= lib/",
  scalaVersion := "2.12.1"
)

lazy val scalapy = project in file("scalapy") dependsOn jeb_windows_x64 settings Seq(
  sourceGenerators in Compile <+= baseDirectory map { dir =>
    val fileToWrite = dir / "src" / "gen" / "scala" / "py" / "ObjectTupleReaders.scala"
    val methods = (2 to 22).map { n =>
      s"""implicit def tuple${n}Reader[${(1 to n).map(t => s"T$t").mkString(", ")}](implicit ${(1 to n).map(t => s"r$t: ObjectReader[T$t]").mkString(", ")}): ObjectReader[(${(1 to n).map(t => s"T$t").mkString(", ")})] = {
         |  new ObjectReader[(${(1 to n).map(t => s"T$t").mkString(", ")})] {
         |    override def read(or: Ref)(implicit jep: Jep) = {
         |      val r = Ref(or.expr).asInstanceOf[DynamicRef]
         |      (${(1 to n).map(t => s"r.arrayAccess(${t - 1}).as[T$t]").mkString(", ")})
         |    }
         |  }
         |}"""
    }
    val toWrite =
      s"""package py
         |import jep.Jep
         |trait ObjectTupleReaders {
         |${methods.mkString("\n")}
         |}""".stripMargin
    IO.write(fileToWrite, toWrite)
    Seq(fileToWrite)
  },
  sourceGenerators in Compile <+= baseDirectory map { dir =>
    val fileToWrite = dir / "src" / "gen" / "scala" / "py" / "ObjectTupleWriters.scala"
    val methods = (2 to 22).map { n =>
      s"""implicit def tuple${n}Writer[${(1 to n).map(t => s"T$t").mkString(", ")}](implicit ${(1 to n).map(t => s"r$t: ObjectWriter[T$t]").mkString(", ")}): ObjectWriter[(${(1 to n).map(t => s"T$t").mkString(", ")})] = {
         |  new ObjectWriter[(${(1 to n).map(t => s"T$t").mkString(", ")})] {
         |    override def write(v: (${(1 to n).map(t => s"T$t").mkString(", ")}))(implicit jep: Jep): Ref = {
         |      val array = Object("[]")
         |      ${(1 to n).map(t => "jep.eval(s\"${array.expr}.append(${Ref.from(v._" + t + ").expr})\")").mkString(";")}
         |      array.asRef
         |    }
         |  }
         |}"""
    }
    val toWrite =
      s"""package py
         |import jep.Jep
         |trait ObjectTupleWriters {
         |${methods.mkString("\n")}
         |}""".stripMargin

    IO.write(fileToWrite, toWrite)
    Seq(fileToWrite)
  },
  fork in Test := true,
  javaOptions in Test += "-Djava.library.path=../lib/",
  javaOptions in runMain += "-Djava.library.path=../lib/",
  scalaVersion := "2.12.1",
  libraryDependencies++=Seq("org.scala-lang" % "scala-reflect" % scalaVersion.value)
  )

lazy val numpy = project in file("scala-numpy") dependsOn scalapy settings (scalaVersion := "2.12.1")

lazy val tensorflow = project in file(".") dependsOn(numpy, scalapy, jeb_windows_x64) settings (scalaVersion := "2.12.1")

lazy val root = project aggregate(tensorflow, jeb_windows_x64, scalapy, numpy) settings (scalaVersion := "2.12.1") dependsOn(numpy, scalapy, jeb_windows_x64)

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

javaOptions in run in Test += "-Djava.library.path=./lib/"
javaOptions in runMain += "-Djava.library.path=./lib/"
