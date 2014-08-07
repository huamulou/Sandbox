package com.sandbox.chapter8_Inheritance.superclassConstruction

/**
 * Created by jin1 on 2014/8/7.
 */
class Person(val name: String, val age: Int) {
  override def toString = getClass.getName + "[name=" + name +
    ",age=" + age + "]"
}
