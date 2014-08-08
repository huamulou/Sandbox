package com.sandbox.chapter8_Inheritance.anonymousSubclasses

/**
 * Created by jin1 on 2014/8/8.
 */
object anonymousSubclasses {
  def meet(p: Person{def greeting: String}) {
    println(p.name + " says: " + p.greeting)
  }

  def main(args: Array[String]) {
    val alien = new Person("Fred") {
      def greeting = "Greetings, Earthling! My name is Fred."
    }
    meet(alien)
  }
}
