package com.sandbox.chapter7_PackagesAndImports.chainedPackageClauses

/**
 * Created by jin1 on 2014/8/5.
 */
package com.horstmann.collection {
  object chainedPackageClauses {
    def main(args: Array[String]) {
      val fred = new com.horstmann.impatient.people.Person("Fred")
      val wilma = new com.horstmann.impatient.people.Person("Wilma")
      val barney = new com.horstmann.impatient.people.Person("Barney")
      fred.friends += wilma
      fred.friends += barney
      println(fred.description) // Fred with friends Wilma, Barney
    }
  }
}
