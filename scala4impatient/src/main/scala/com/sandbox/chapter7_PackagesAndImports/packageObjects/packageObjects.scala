package com.sandbox.chapter7_PackagesAndImports.packageObjects

/**
 * Created by Jolin&Vash on 2014/8/6.
 */
object packageObjects {
  def main(args: Array[String]) {
    val john = new com.horstmann.impatient.people.Person
    println(john.description)  // A person with name John Q. Public
  }
}
