package com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.employee

/**
 * Created by jin1 on 2014/8/6.
 */
class Person {
  protected var id = 0
  protected[this] var age = 0
  def setAge(newAge: Int) { // A person can never get younger
    if (newAge > age) age = newAge
  }
}