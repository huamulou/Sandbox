package com.sandbox.chapter7_PackagesAndImports.chainedPackageClauses

/**
 * Created by jin1 on 2014/8/5.
 */
package com.horstmann.impatient {
  package people {
    class Person(val name: String) {
      val friends = new collection.mutable.ArrayBuffer[Person]
      // Doesn't pick up collection from com.horstmann.collection
      def description = name + " with friends " +
        friends.map(_.name).mkString(", ")
    }
  }
}
