package com.sandbox.chapter17_TypeParameters.variance

/**
 * Created by jin1 on 2014/9/23.
 */

// This contravariant Friend trait allows conversion of a
// Friend[Person] to a Friend[Student]
trait Friend[-T] {
  def befriend(someone: T)
}

class Person3(name: String) extends Friend[Person3] {
  override def toString = getClass.getName + " " + name
  def befriend(someone: Person3) {
    this + " and " + someone + " are now friends."
  }
}

class Student3(name: String) extends Person3(name)

object variance3 {
  def main(args: Array[String]) {
    def makeFriendWith(s: Student3, f: Friend[Student3]) { f.befriend(s) }

    val susan = new Student3("Susan")
    val fred = new Person3("Fred")

    makeFriendWith(susan, fred) // Ok, Fred is a Friend of any person

    // A unary function has variance Function1[-A, +R]

    def findFred(s: Student3) = new Person3("Fred")

    // A unary function has variance Function1[-A, +R]
    def friends1(students: Array[Student3], find: Function1[Student3, Person3]) =
      for (s <- students) yield find(s)
    val person1 = friends1(Array(susan, new Student3("Barney")), findFred)
    println(person1.mkString("#"))  // com.sandbox.chapter17_TypeParameters.variance.Person3 Fred#com.sandbox.chapter17_TypeParameters.variance.Person3 Fred

    def friends2(students: Array[Student3], find: Student3 => Person3) =
    for (s <- students) yield find(s)
    val person2 = friends2(Array(susan, new Student3("Barney")), findFred)
    println(person2.mkString("#"))  // com.sandbox.chapter17_TypeParameters.variance.Person3 Fred#com.sandbox.chapter17_TypeParameters.variance.Person3 Fred
  }
}
