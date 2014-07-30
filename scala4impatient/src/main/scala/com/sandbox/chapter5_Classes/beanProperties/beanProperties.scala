package com.sandbox.chapter5_Classes.beanProperties

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
object beanProperties {
  def main(args: Array[String]) {
    val fred = new Person
    fred.setName("Fred")
    println(fred.getName)
  }
}
