package com.sandbox.chapter17_TypeParameters.variance

/**
 * Created by jin1 on 2014/9/23.
 */

class Person2(name: String) {
  override def toString = getClass.getName + " " + name
}

class Student2(name: String) extends Person2(name)

// Making Pair covariant allows conversion of a
// Pair[Student] to a Pair[Person]
class Pair2[+T](val first: T, val second: T) {
  override def toString = "(" + first + "," + second + ")"
}

object variance2 {
  def makeFriends(p: Pair2[Person2]) =
    p.first + " and " + p.second + " are now friends."

  def main(args: Array[String]) {
    val fred = new Student2("Fred")
    val wilma = new Student2("Wilma")
    val studentPair = new Pair2(fred, wilma)

    makeFriends(studentPair) // OK
  }
}
