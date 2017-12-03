lazy val root = (project in file("."))
  .settings(
      name := "Hello",
      scalaVersion := "2.12.3",
      mainClass in (Compile,run) := Some("DayTwo"),
      libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )