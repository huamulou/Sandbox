package com.sandbox.chapter8_Inheritance.abstractFields

/**
 * Created by jin1 on 2014/8/8.
 */
class Employee(val id: Int) extends Person { // Subclass has concrete id property
  var name = "" // and concrete name property
}
