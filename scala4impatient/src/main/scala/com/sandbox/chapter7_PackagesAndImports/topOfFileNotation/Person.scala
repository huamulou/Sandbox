package com.sandbox.chapter7_PackagesAndImports.topOfFileNotation

/**
 * Created by Jolin&Vash on 2014/8/6.
 */
package com.horstmann.impatient
package people

class Person {
  val cars = new scala.collection.mutable.ArrayBuffer[Car]
  // Car is in the package com.horstmann.impatient
  def description = "A person with " + cars.length + " cars"
}
