lazy val upload = project in file(".") dependsOn(shapes)

lazy val shapes = ProjectRef(base = file("../../modules/shapes"), id = "shapes")

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.2.2"
)