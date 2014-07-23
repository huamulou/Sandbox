package com.sandbox.chapter1_TheBasics.declareValAndVar

/**
 * Created by Jolin&Vash on 2014/7/19.
 */
object declareValAndVar {
  def main(args: Array[String]) {
    // val is equals a constants,in other words,the effect is as same as final in java
    val answer = 8 * 5 + 2
    println(answer)

    //incorrect: whatever the val or var must be initialized even with null is ok
    //var counter
    val greeting = null
    var counter = 0
    println(greeting)
    println(counter)

    //You could specify the type of val or var as well
    val hello : Any = "Hello"
    var world : Any = "World"
    println(hello)
    println(world)

    //You could put several val or var together to be initialized
    val xmax, ymax = 100
    var greetings, message : String = null
    println(xmax + ymax)
    println(greetings + message)

  }

}
