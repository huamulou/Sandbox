package com.sandbox.chapter7_PackagesAndImports.topOfFileNotation

/**
 * Created by Jolin&Vash on 2014/8/6.
 */
package com.horstmann.impatient
package people

object topOfFileNotation {
  def main(args: Array[String]) {
    val fred = new Person
    fred.cars += new Car
    fred.cars += new Car
    println(fred.description)  // A person with 2 cars
  }
}
