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

object variance1 {
  def main(args: Array[String]) {
    def makeFriends(p: Pair1[Person1]) =
      p.first + " and " + p.second + " are now friends."

    val fred = new Student1("Fred")
    val wilma = new Student1("Wilma")

    val studentPair = new Pair1(fred, wilma)

    // Type mismatch, expected: Pair[Person], actual: Pair[Student]
    // makeFriends(studentPair)
  }
}
