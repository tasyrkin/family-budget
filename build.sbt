name := """family-budget"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.sorm-framework" % "sorm" % "0.3.8",
  "com.h2database" % "h2" % "1.3.168"
)
