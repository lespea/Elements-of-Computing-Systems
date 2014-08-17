import OneLogKeys._

name := "elements-of-computing-systems"

organization := "com.lespea"

organizationName := "Lespea scala projects"

version := "0.1"

scalaVersion := "2.11.2"

scalacOptions ++= Seq(
    "-encoding", "utf8",
    "-language:implicitConversions",
    "-target:jvm-1.7",
    "-Ybackend:GenBCode",
    "-Yclosure-elim",
    "-Ydelambdafy:method",
    "-optimise",
    "-Yinline-warnings",
    "-Xlint",
    "-Xprint-types",
    "-Yno-adapted-args",
    "-Ywarn-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-inaccessible",
    "-Ywarn-infer-any",
    "-Ywarn-nullary-override",
    "-Ywarn-nullary-unit",
    "-Ywarn-numeric-widen",
    "-Ywarn-unused",
    "-Ywarn-value-discard",
    "-deprecation",
    "-feature",
    "-unchecked"
)

javacOptions ++= Seq(
    "-source", "1.8",
    "-target", "1.8",
    "-depreacation",
    "-encoding", "utf8",
    "-Xlint:all"
)

libraryDependencies ++= Seq(
    "org.scalatest"  %% "scalatest"  % "2.2.1"  % "test",
    "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)


// oneLogSettings will add libDependencies and resolvers

oneLogSettings


// scalaStyle
org.scalastyle.sbt.ScalastylePlugin.Settings

// Create a default Scala style task to run with tests
lazy val testScalaStyle = taskKey[Unit]("testScalaStyle")

testScalaStyle := {
  org.scalastyle.sbt.PluginKeys.scalastyle.toTask(" q w").value
}

(test in Test) <<= (test in Test) dependsOn testScalaStyle


// linter
resolvers += "linter" at "http://hairyfotr.github.io/linteRepo/releases"

addCompilerPlugin("com.foursquare.lint" %% "linter" % "0.1-SNAPSHOT")
