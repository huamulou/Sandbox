package com.sandbox.chapter2_ControlStructuresAndFunctions.defaultAndNamedArguments

/**
 * Created by Jolin&Vash on 2014/7/21.
 */
object defaultAndNamedArguments {
  def main(args: Array[String]) {
    def decorate(str: String, left: String = "[", right: String = "]") =
      left + str + right

    println(decorate("Hello"))    // [Hello]

    println(decorate("Hello", "<<<", ">>>"))    // <<<Hello>>>

    println(decorate("Hello", ">>>["))    // >>>[Hello]

    // named args don't have to be sequentially appeared
    println(decorate(left = "<<<", str = "Hello", right = ">>>"))   // <<<Hello>>>

    // unnamed agrs must be sequentially appeared before named agrs
    println(decorate("Hello", right = "]<<<"))    // [Hello]<<<
  }
}
