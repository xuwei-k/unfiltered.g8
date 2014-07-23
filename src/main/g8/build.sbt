organization := "com.example"

name := "$name$"

version := "$version$"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-directives" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-specs2" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
