package com.sandbox.chapter5_Classes.auxiliaryConstructors

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
object auxiliaryConstructors {
  def main(args: Array[String]) {
    val p1 = new Person // Primary constructor
    val p2 = new Person("Fred") // First auxiliary constructor
    val p3 = new Person("Fred", 42) // Second auxiliary constructor

    println(p1.description)  //  is 0 years old
    println(p2.description)  // Fred is 0 years old
    println(p3.description)  // Fred is 42 years old
  }
}
