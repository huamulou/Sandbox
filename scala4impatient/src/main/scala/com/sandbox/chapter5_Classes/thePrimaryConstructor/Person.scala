package com.sandbox.chapter5_Classes.thePrimaryConstructor

/**
 * Created by jin1 on 2014/7/31.
 */
class Person(val name: String = "", val age: Int = 0) {
  println("Just constructed another person")
  def description = {
    println("description method")
    name + " is " + age + " years old"
  }
}
