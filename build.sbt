scalaVersion := "2.12.7"

name := "scala-modules-showcase"
organization := "com.sysgears.showcases"
version := "1.0"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.2.2",
  "org.clapper" %% "classutil" % "1.4.0",
  "com.typesafe" % "config" % "1.3.3",
  "net.codingwell" %% "scala-guice" % "4.2.1",
)
