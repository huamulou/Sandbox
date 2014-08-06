package com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods

import com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.employee.Manager

/**
 * Created by jin1 on 2014/8/6.
 */
object protectedFieldsAndMethods {
  def main(args: Array[String]) {
    var fred = new Manager
    fred.setAge(50)
    fred.setSalary(100000)
    /**
     * Since the id's modifier is protected which can't accessed in different package
     * but the sub-class instead, the following doesn't work:
     *      println(fred.id)
     * */

    var wilma = new Manager
    wilma.setAge(55)
    wilma.setSalary(90000)
    if (fred.isSeniorTo(wilma))
      println(fred.description + "\nis senior to " + wilma.description)
    else
      println(wilma.description + "\nis senior to " + fred.description)
  }
}
