package com.sandbox.chapter8_Inheritance.overridingMethod

/**
 * Created by jin1 on 2014/8/6.
 */
class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}
