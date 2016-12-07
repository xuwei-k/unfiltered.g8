organization := "com.example"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

val unusedWarnings = (
  "-Ywarn-unused" ::
  "-Ywarn-unused-import" ::
  Nil
)

scalacOptions ++= PartialFunction.condOpt(CrossVersion.partialVersion(scalaVersion.value)){
  case Some((2, v)) if v >= 11 => unusedWarnings
}.toList.flatten

Seq(Compile, Test).flatMap(c =>
  scalacOptions in (c, console) --= unusedWarnings
)

scalacOptions ++= "-deprecation" :: "unchecked" :: "-feature" :: Nil

libraryDependencies ++= Seq(
  "ws.unfiltered" %% "unfiltered-directives" % "$unfiltered_version$",
  "ws.unfiltered" %% "unfiltered-filter" % "$unfiltered_version$",
  "ws.unfiltered" %% "unfiltered-jetty" % "$unfiltered_version$",
  "ws.unfiltered" %% "unfiltered-specs2" % "$unfiltered_version$" % "test"
)
