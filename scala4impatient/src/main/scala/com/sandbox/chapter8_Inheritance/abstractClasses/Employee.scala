package com.sandbox.chapter8_Inheritance.abstractClasses

/**
 * Created by jin1 on 2014/8/8.
 */
class Employee(name: String) extends Person(name) {
  def id = name.hashCode // override keyword not required
}
