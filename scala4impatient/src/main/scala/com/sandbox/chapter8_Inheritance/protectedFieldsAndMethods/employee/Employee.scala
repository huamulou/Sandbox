package com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.employee
import com.sandbox.chapter8_Inheritance.protectedFieldsAndMethods.Person
/**
 * Created by jin1 on 2014/8/6.
 */
class Employee {
  val person = new Person
  /**
   * Since the id's modifier is protected which can't accessed in different package
   * but the sub-class instead, the following doesn't work:
   *      def id = person.id
   * */
}
