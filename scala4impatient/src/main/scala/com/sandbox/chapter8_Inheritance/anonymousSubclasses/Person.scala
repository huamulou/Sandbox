package com.sandbox.chapter8_Inheritance.anonymousSubclasses

/**
 * Created by jin1 on 2014/8/8.
 */
class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}
