package com.sandbox.chapter14_PatternMatchingAndCaseClasses.patternsInVariableDeclarations

/**
 * Created by jin1 on 2014/9/17.
 */
object patternsInVariableDeclarations {
  def main(args: Array[String]) {
    val (x, y) = (1, 2)
    println("x = " + x)  // x = 1
    println("y = " + y)  // y = 2

    val (q, r) = BigInt(10) /% 3
    println("q = " + q)  // q = 3
    println("r = " + r)  // r = 1

    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    println("first = " + first)  // first = 1
    println("second = " + second)  // second = 7
  }
}
