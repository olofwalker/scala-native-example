lazy val make = taskKey[Unit]("Building native components")

make := {
  "make" !
}

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.11"

nativeLinkingOptions ++= Seq("-L" ++ baseDirectory.value.getAbsolutePath() ++ "/target")

nativeMode := "release"

nativeGC := "immix"

compile in Compile := (compile in Compile dependsOn make).value
