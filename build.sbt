name := "dbd-build-maker"

version := "1.0"

lazy val `dbd-build-maker` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(javaJdbc, cache, javaWs)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")

      