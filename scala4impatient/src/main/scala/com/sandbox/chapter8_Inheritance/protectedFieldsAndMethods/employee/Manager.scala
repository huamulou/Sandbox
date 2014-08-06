package com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.employee

import com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.employee.Person

/**
 * Created by jin1 on 2014/8/6.
 */
class Manager extends Person {
  protected var salary = 0.0
  def setSalary(newSalary: Double) { // A manager's salary can never decrease
    if (newSalary > salary) salary = newSalary
  }
  // Can access age from superclass wherever they are in the same package or not
  def description = "a manager who is " + age +
    " years old and makes " + salary

  def isSeniorTo(other: Manager) =
    salary > other.salary
  // Can't access age of another person. The following doesn't work:
  // age > other.age
}