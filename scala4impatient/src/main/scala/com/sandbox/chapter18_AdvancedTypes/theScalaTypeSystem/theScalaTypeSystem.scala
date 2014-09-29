package com.sandbox.chapter18_AdvancedTypes.theScalaTypeSystem

/**
 * Created by jin1 on 2014/9/29.
 */
object theScalaTypeSystem {
  def main(args: Array[String]) {
    // A method of the REPL object
    def square(x: Int) = x * x

    // Turned into a function
    val squareFunction = square _

    // A function
    val triple = (x: Int) => 3 * x
  }
}
