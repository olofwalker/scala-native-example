/*
Scala Native Example
Copyright (C) 2016 Robert Walker

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package example
// Import stuff that we need in the library
import scalanative.native._

object Main {
  def main(args: Array[String]): Unit = {
    println("Running stub function")
    stub.gen(c"hello.wrl")
    println("Done...")
  }
}

// Define the external module, the C library contaning our function "gen"
@extern
@link("stub")
// Aribtary object name
object stub {
  // Name and signature of C function
  def gen(fileName: CString) : Unit = extern // CString = const char * 
}


