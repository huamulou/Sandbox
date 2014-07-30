package com.sandbox.chapter5_Classes.propertiesWithGettersAndSetters

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
object propertiesWithGettersAndSetters {
  def main(args: Array[String]) {
    val fred = new Person
    fred.age = 21
    println(fred.age)   // 21

    val anotherFred = new AnotherPerson
    anotherFred.age = 30
    anotherFred.age = 21
    println(anotherFred.age)  // 30
  }
}
