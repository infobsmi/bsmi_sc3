val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "bsmi_sc3",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    nativeImageVersion := "22.1.0",

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

    libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.6.2"

  )
