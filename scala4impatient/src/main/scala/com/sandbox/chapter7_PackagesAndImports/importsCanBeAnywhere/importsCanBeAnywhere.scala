package com.sandbox.chapter7_PackagesAndImports.importsCanBeAnywhere

/**
 * Created by jin1 on 2014/8/6.
 */
object importsCanBeAnywhere {
  def main(args: Array[String]) {
    val wilma = new Manager
    val employees = collection.mutable.HashSet(
      // import collection.mutable._ doesn't extend until here
      new Employee("Fred"), new Employee("Barney"))
    wilma.subordinates ++= employees
    println(wilma + ": " + wilma.description)
  }
}
