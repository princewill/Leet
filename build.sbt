name := "leet"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

organization := "com.will"

libraryDependencies ++=
  {
    Seq(
      "org.mockito" % "mockito-core" % "1.9.5" % "test",
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    )
}