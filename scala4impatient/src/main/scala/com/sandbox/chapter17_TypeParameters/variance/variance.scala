package com.sandbox.chapter17_TypeParameters.variance

/**
 * Created by jin1 on 2014/9/23.
 */

class Person1(name: String) {
  override def toString = getClass.getName + " " + name
}

class Student1(name: String) extends Person1(name)

class Pair1[T](val first: T, val second: T) {
  override def toString = "(" + first + "," + second + ")"
}

// Making Pair covariant allows conversion of a
// Pair[Student] to a Pair[Person]

class Pair2[+T](val first: T, val second: T) {
  override def toString = "(" + first + "," + second + ")"
}

// This contravariant Friend trait allows conversion of a
// Friend[Person] to a Friend[Student]
trait Friend[-T] {
  def befriend(someone: T)
}

class Person2(name: String) extends Friend[Person2] {
  override def toString = getClass.getName + " " + name
  def befriend(someone: Person2) {
    this + " and " + someone + " are now friends."
  }
}

class Student2(name: String) extends Person2(name)

object variance {
  def main(args: Array[String]) {
    def makeFriends1(p: Pair1[Person1]) =
      p.first + " and " + p.second + " are now friends."

    val fred = new Student1("Fred")
    val wilma = new Student1("Wilma")

    val studentPair1 = new Pair1(fred, wilma)

    // Type mismatch, expected: Pair[Person], actual: Pair[Student]
    // makeFriends1(studentPair)

    def makeFriends2(p: Pair2[Person1]) =
      p.first + " and " + p.second + " are now friends."

    val studentPair2 = new Pair2(fred, wilma)
    makeFriends2(studentPair2) // OK

    def makeFriendWith(s: Student2, f: Friend[Student2]) { f.befriend(s) }
    val susan = new Student2("Susan")
    val anotherFred = new Person2("Fred")

    makeFriendWith(susan, anotherFred) // Ok, anotherFred is a Friend of any person

    // A unary function has variance Function1[-A, +R]
    def friends(students: Array[Student2], find: Function1[Student2, Person2]) =
      for (s <- students) yield find(s)

    def friends(students: Array[Student2], find: Student2 => Person2]) =
    for (s <- students) yield find(s)

    def findFred(s: Student2) = new Person2("Fred")

    friends(Array(susan, new Student2("Barney")), findFred)

  }
}
