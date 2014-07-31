package com.sandbox.chapter5_Classes.thePrimaryConstructor

/**
 * Created by jin1 on 2014/7/31.
 */
object thePrimaryConstructor {
  def main(args: Array[String]) {
    val p1 = new Person                   // Just constructed another person
    val p2 = new Person("Fred")          // Just constructed another person
    val p3 = new Person("Fred", 42)      // Just constructed another person
    println(p1.description)   //  is 0 years old
    println(p2.description)   // Fred is 0 years old
    println(p3.description)   // Fred is 42 years old

    val p = new AnotherPerson("Fred", 42)
    println(p.name)  // Fred
    // Error--it's private
    // println(p.age)
    println(p.birthday())  // ()
    println(p.description)  // Fred is 43 years old
  }
}
