package com.sandbox.chapter11_Operators.infixOperators

/**
 * Created by jin1 on 2014/9/3.
 */
object infixOperators {
  def main(args : Array[String]){
    println(1 to 10)  // Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(1.to(10))  // Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(1 -> 10)  // (1,10)
    println(1 .->(10))  // (1,10)

    // Here 1. is a floating-point number
    println(1.->10)  // (1.0,10)

    val f1 = new Fraction(3, 4)
    val f2 = new Fraction(2, 5)
    println(f1 * f2)  // 3/10
  }
}
