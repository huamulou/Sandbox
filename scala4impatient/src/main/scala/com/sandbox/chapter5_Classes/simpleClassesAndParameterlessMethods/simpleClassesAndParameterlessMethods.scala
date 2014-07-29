package com.sandbox.chapter5_Classes.simpleClassesAndParameterlessMethods

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
object simpleClassesAndParameterlessMethods {
  def main(args: Array[String]) {
    val myCounter1 = new Counter
    myCounter1.increment()
    println(myCounter1.current)

    val myCounter2 = new Counter() // () ok
    println(myCounter2.current()) // () ok

    val anotherCounter = new AnotherCounter
    //myCounter.current() // () not ok
    anotherCounter.current // must remove the (),since the current method definition is ignore the ()
  }
}
