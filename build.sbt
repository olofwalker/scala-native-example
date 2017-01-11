lazy val make = taskKey[Unit]("Building native components")

make := {
  "make" !
}

resolvers += Resolver.sonatypeRepo("snapshots")

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.8"

nativeClangOptions ++= Seq("-L" ++ baseDirectory.value.getAbsolutePath() ++ "/target")

compile in Compile := (compile in Compile dependsOn make).value
