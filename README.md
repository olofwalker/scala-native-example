# scala-native-example
A minimal Scala native example (https://github.com/scala-native/scala-native)

- The project contains two source code files, a main.scala file that will call a function in stub.c
- The scala native plugin is added in the project/plugins.sbt file
- build.sbt runs the makefile, producing the shared library in the \target directory
- A custom library path is added to nativeClangOptions so the stub library is found
- Compile & run with "sbt run"

# Dependencies

Fedora:

sudo dnf install clang-devel libgc-devel llvm-devel

