name := "scapegoat-false-positive"
version := "1.0"

scalaVersion := "2.12.6"

scalaSource in Compile := baseDirectory.value / "app"
scalaSource in Test := baseDirectory.value / "test"

scapegoatVersion in ThisBuild := "1.3.8"

libraryDependencies ++= Seq(
  "in.nvilla" % "monadic-html_sjs0.6_2.12" % "0.4.0-RC1"
)
