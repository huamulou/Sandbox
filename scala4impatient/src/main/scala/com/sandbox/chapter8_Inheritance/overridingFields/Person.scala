package com.sandbox.chapter8_Inheritance.overridingFields

/**
 * Created by jin1 on 2014/8/7.
 */
class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}
