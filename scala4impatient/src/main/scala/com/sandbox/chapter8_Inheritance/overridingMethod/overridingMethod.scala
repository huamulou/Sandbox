package com.sandbox.chapter8_Inheritance.overridingMethod

/**
 * Created by jin1 on 2014/8/6.
 */
object overridingMethod {
  def main(args: Array[String]) {
    val fred = new Employee
    fred.name = "Fred"
    fred.salary = 50000
    println(fred)  // com.sandbox.chapter8_Inheritance.overridingMethod.Employee[name=Fred][salary=50000.0]
  }
}
