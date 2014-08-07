package com.sandbox.chapter8_Inheritance.overridingFields

/**
 * Created by jin1 on 2014/8/7.
 */
object overridingFields {
  def main(args: Array[String]) {
    val fred = new Person("Fred")
    println(fred.name)
    val james = new SecretAgent("007")
    println(james.name)

    val wilma = new Student(1729)
    println(wilma.id)
    val tommy = new AnotherSecretAgent
    println(tommy.id)
  }
}
