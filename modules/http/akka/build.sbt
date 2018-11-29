lazy val akka = project in file(".") dependsOn(shapes)

lazy val shapes = ProjectRef(base = file("../../shapes"), id = "shapes")

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.2.2"
)