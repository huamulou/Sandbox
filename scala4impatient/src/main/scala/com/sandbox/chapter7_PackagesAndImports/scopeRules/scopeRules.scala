package com.sandbox.chapter7_PackagesAndImports.scopeRules

/**
 * Created by jin1 on 2014/8/5.
 */
object scopeRules {
  def main(args: Array[String]) {
    val fred = new com.horstmann.impatient.Employee(50000)
    fred.giveRaise(10)
    println(fred.getClass.getName + ": " + fred.description)  // com.sandbox.chapter7_PackagesAndImports.scopeRules.com.horstmann.impatient.Employee: An employee with salary 55000.0

    val wilma = new com.horstmann.impatient.Manager
    wilma.subordinates += fred
    wilma.subordinates += new com.horstmann.impatient.Employee(50000)
    println(wilma.getClass.getName + ": " + wilma.description)  // com.sandbox.chapter7_PackagesAndImports.scopeRules.com.horstmann.impatient.Manager: A manager with 2 subordinates
  }
}
