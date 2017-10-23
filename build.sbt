name := """jonathanfrawley_com"""
organization := "com.jonathanfrawley"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.6.7"
libraryDependencies += "com.atlassian.commonmark" % "commonmark" % "0.10.0"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.jonathanfrawley.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.jonathanfrawley.binders._"
