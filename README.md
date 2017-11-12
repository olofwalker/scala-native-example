# scala-native-example
A minimal Scala Native example that calls a C function (https://github.com/scala-native/scala-native)

## About the example

- The project contains two source code files, main.scala and stub.c
- Main.scala will call a function in stub.c
- The stub.c function `writeFile` called from Scala will write a file in the current working directory

## About the build process

- The scala native plugin is added in the `project/plugins.sbt` file
- build.sbt runs the makefile, producing the shared library in the `\target` directory
- A custom library path is added to `nativeLinkingOptions` so the stub library can be found
- Compile & run with `sbt run`
- The resulting native executable can be found in `target/scala-2.11`

# Requirements

- 64 bit Linux based OS

# Dependencies

Fedora:

sudo dnf install clang-devel libgc-devel llvm-devel libunwind-devel

