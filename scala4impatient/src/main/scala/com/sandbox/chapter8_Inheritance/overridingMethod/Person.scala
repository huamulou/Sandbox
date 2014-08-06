package com.sandbox.chapter8_Inheritance.overridingMethod

/**
 * Created by jin1 on 2014/8/6.
 */
class Person {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}
