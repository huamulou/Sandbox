package com.sandbox.chapter8_Inheritance.abstractFields

/**
 * Created by jin1 on 2014/8/8.
 */
abstract class Person {
  val id: Int
  // No initializer—this is an abstract field with an abstract getter method
  var name: String
  // Another abstract field, with abstract getter and setter methods
  override def toString = getClass.getName + "[id=" + id + ",name=" + name + "]"
}
