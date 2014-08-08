package com.sandbox.chapter8_Inheritance.abstractFields

/**
 * Created by jin1 on 2014/8/8.
 */
object abstractFields {
  val james = new Employee(7)

  val fred = new Person {
    val id = 1729
    var name = "Fred"
  }
}
