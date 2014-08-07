package com.sandbox.chapter8_Inheritance.superclassConstruction

/**
 * Created by jin1 on 2014/8/7.
 */
class Employee(name: String, age: Int, val salary : Double) extends
  Person(name, age) {
  override def toString = super.toString + "[salary=" + salary + "]"
}
