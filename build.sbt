import scala.sys.process.Process

val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "bsmi_sc3",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.6.2",
    libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.5.7" % "provided",
    libraryDependencies += "com.softwaremill.macwire" %% "util" % "2.5.7",
    libraryDependencies += "com.softwaremill.macwire" %% "proxy" % "2.5.7",
  )

lazy val bdoc = taskKey[Unit]("build and open document")

bdoc := {
  println("now we begin to build and open doc")
  Process(List("pwd")).!
  Process(List("sbt", "doc")).!
  Process(List("open", "./target/scala-3.1.3/api/index.html")).!
  println("end")

}
