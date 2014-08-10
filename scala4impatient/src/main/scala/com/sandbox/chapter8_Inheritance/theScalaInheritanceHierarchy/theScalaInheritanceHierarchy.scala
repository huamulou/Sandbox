package com.sandbox.chapter8_Inheritance.theScalaInheritanceHierarchy

/**
 * Created by Jolin&Vash on 2014/8/10.
 */
object theScalaInheritanceHierarchy {

  def printAny(x: Any) { println(x) }
  def printUnit(x: Unit) { println(x) }

  def main(args: Array[String]) {
    val account = new Account(1000.0)
    val amount = 100.0
    account.synchronized { account.balance += amount }
    printAny("Hello") // Hello
    printUnit("Hello")  // ()
  }
}
