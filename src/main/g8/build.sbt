organization := "com.example"

name := "$name$"

version := "$version$"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-directives" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
