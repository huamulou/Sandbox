package com.sandbox.chapter5_Classes.propertiesWithOnlyGetters

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
object propertiesWithOnlyGetters {
  def main(args: Array[String]) {
    val msg = new Message
    println(msg.timeStamp)  // current date

    val myCounter = new Counter
    //before invoke increment setter method
    println(myCounter.current)  // 0
    myCounter.increment
    println(myCounter.current)  // 1
  }
}
