name := "app"

version := "0.1"

scalaVersion := "2.12.7"

lazy val app = project in file(".") dependsOn(akka, play, upload)

lazy val akka = ProjectRef(base = file("../modules/http/akka"), id = "akka")

lazy val play = ProjectRef(base = file("../modules/http/play"), id = "play")

lazy val upload = ProjectRef(base = file("../modules/upload"), id = "upload")

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.2.2"
)