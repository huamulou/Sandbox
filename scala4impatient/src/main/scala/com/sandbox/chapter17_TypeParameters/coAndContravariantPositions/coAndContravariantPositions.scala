package com.sandbox.chapter17_TypeParameters.coAndContravariantPositions

/**
 * Created by Jolin&Vash on 2014/9/25.
 */

class Person(name: String) {
  override def toString = getClass.getName + " " + name
}

class Student(name: String) extends Person(name)

// You cannot define a covariant mutable pair
// Error:(14, 7) covariant type T occurs in contravariant position in type T of value first_=
// class Pair1[+T](var first: T, var second: T)

// This pair is immutable
class Pair2[+T](val first: T, val second: T) {
  // But newFirst is in a contravariant position
  // Error:(19, 20) covariant type T occurs in contravariant position in type T of value newFirst
  //def replaceFirst(newFirst: T) = new Pair2[T](newFirst, second)
}

class Pair3[+T](val first: T, val second: T) {
  // Remedy: Another type parameter
  def replaceFirst[R >: T](newFirst: R) = new Pair3[R](newFirst, second)
}

object coAndContravariantPositions {
  def main(args: Array[String]) {
    val length = 10
    val students1 = new Array[Student](length)

    // Not legal, but suppose it was . . .
    // val people1: Array[Person] = students1

    // Let's force it, so you can see what happens
    val people2: Array[Person] = students1.asInstanceOf[Array[Person]]

    // Oh no! Now students(0) isn’t a Student
    // java.lang.ArrayStoreException
    // people2(0) = new Person("Fred")

    val people3 = new Array[Person](length)

    // Not legal, but suppose it was . . .
    // val students2: Array[Student] = people3

    // Let's force it, so you can see what happens
    // Exception in thread "main" java.lang.ClassCastException: [Lcom.sandbox.chapter17_TypeParameters.coAndContravariantPositions.Person; cannot be cast to [Lcom.sandbox.chapter17_TypeParameters.coAndContravariantPositions.Student;
    // val students3: Array[Student] = people3.asInstanceOf[Array[Student]]
  }
}
