package com.sandbox.chapter17_TypeParameters.boundsForTypeVariables

/**
 * Created by Jolin&Vash on 2014/9/23.
 */
class Pair1[T](val first: T, val second: T) {
  // Error
  // def smaller = if (first.compareTo(second) < 0) first else second
}

class Pair2[T <: Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
}

class Pair3[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair3(newFirst, second)
  override def toString = "(" + first + "," + second + ")"
}

class Person2(name: String) {
  override def toString = getClass.getName + " " + name
}

class Student(name: String) extends Person2(name)

// Don't omit the upper bound:
class Pair4[T](val first: T, val second: T) {
  def replaceFirst[R](newFirst: R) = new Pair4(newFirst, second)
  override def toString = "(" + first + "," + second + ")"
}

object boundsForTypeVariables {
  def main(args: Array[String]) {
    val p2 = new Pair2("Fred", "Brooks")
    println(p2.smaller)  // Brooks
    // Since Int is not the sub-class of Comparable, the code won't work--see Section 17.4 for a remedy
    // new Pair2(4, 2)

    val fred = new Student("Fred")
    val wilma = new Student("Wilma")
    val barney = new Person2("Barney")

    val p3 = new Pair3(fred, wilma)
    p3.replaceFirst(barney) // A Pair3[Person2]
    println(p3.toString)  // (com.sandbox.chapter17_TypeParameters.boundsForTypeVariables.Student Fred,com.sandbox.chapter17_TypeParameters.boundsForTypeVariables.Student Wilma)

    val p4 = new Pair4(fred, wilma)
    p4.replaceFirst(barney) // A Pair4[Any]
  }
}
