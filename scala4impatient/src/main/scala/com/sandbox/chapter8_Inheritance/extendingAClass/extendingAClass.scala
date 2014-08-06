package com.sandbox.chapter8_Inheritance.extendingAClass

/**
 * Created by jin1 on 2014/8/6.
 */
object extendingAClass {
  def main(args: Array[String]) {
    val fred = new Employee
    fred.name = "Fred"
    fred.salary = 50000
    println(fred.description)
  }
}
