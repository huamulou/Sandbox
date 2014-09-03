package com.sandbox.chapter11_Operators.theApplyAndUpdateMethods

/**
 * Created by jin1 on 2014/9/3.
 */
object theApplyAndUpdateMethods {
  def main(args : Array[String]){
    val scores = new scala.collection.mutable.HashMap[String, Int]
    println(scores)  // Map()

    scores("Bob") = 100 // is equal to scores.update("Bob", 100)
    println(scores)  // Map(Bob -> 100)

    scores.update("Mike", 99)
    println(scores)  // Map(Bob -> 100, Mike -> 99)

    val bobsScore = scores("Bob")
    println(bobsScore)  // 100

    println(scores.apply("Mike"))  // 99

    val result = Fraction(3, 4) * Fraction(2, 5)
    println(result)  // 3/10
  }
}
