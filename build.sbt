name := """family-budget"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.sorm-framework" % "sorm" % "0.3.18",
  "com.h2database" % "h2" % "1.3.168"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
