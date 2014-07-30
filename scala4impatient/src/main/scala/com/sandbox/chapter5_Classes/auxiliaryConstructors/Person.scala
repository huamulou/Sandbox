package com.sandbox.chapter5_Classes.auxiliaryConstructors

/**
 * Created by Jolin&Vash on 2014/7/31.
 */
class Person {
  private var name = ""
  private var age = 0

  def this(name: String) { // An auxiliary constructor
    this() // Calls primary constructor
    this.name = name
  }
  def this(name: String, age: Int) { // Another auxiliary constructor
    this(name) // Calls previous auxiliary constructor
    this.age = age
  }

  def description = name + " is " + age + " years old"
}
