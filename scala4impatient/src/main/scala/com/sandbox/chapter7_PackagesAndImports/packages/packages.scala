package com.sandbox.chapter7_PackagesAndImports.packages

/**
 * Created by jin1 on 2014/8/5.
 */
object packages {
  def main(args: Array[String]) {
    val fred = new com.horstmann.impatient.Employee(1729)
    val wilma = new com.horstmann.impatient.Manager("Wilma")
    val myCounter = new org.bigjava.Counter
    println(fred.getClass.getName + ": " + fred.description)  // com.sandbox.chapter7_PackagesAndImports.packages.com.horstmann.impatient.Employee: An employee with id 1729
    println(wilma.getClass.getName + ": " + wilma.description)  // com.sandbox.chapter7_PackagesAndImports.packages.com.horstmann.impatient.Manager: A manager with name Wilma
    println(myCounter.getClass.getName + ": " + myCounter.description)  // com.sandbox.chapter7_PackagesAndImports.packages.org.bigjava.Counter: A counter with value 0
  }
}
