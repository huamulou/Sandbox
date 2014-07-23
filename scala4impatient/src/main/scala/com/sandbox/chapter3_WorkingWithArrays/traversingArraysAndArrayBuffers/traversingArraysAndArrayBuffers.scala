package com.sandbox.chapter3_WorkingWithArrays.traversingArraysAndArrayBuffers

/**
 * Created by Jolin&Vash on 2014/7/22.
 */
object traversingArraysAndArrayBuffers {
  def main(args: Array[String]) {
    val a = Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

    for (i <- 0 until a.length)
      print(i + ": " + a(i) + " ")
    println()   // 0: 1 1: 1 2: 2 3: 3 4: 5 5: 8 6: 13 7: 21 8: 34 9: 55

    for(i <- 0 until a.length)
      print(a(i) + " ")
    println()   // 1 1 2 3 5 8 13 21 34 55

    // the second argment stand for the number to increase by for each step of the range
    for(i <- 0 until (a.length, 4))
      print(a(i) + " ")
    println()   //  1 5 34

    for(i <- (0 until a.length).reverse)
      print(a(i) + " ")   // 55 34 21 13 8 5 3 2 1 1
    println()

    for (elem <- a){
      print(elem); print(" ")  // 1 1 2 3 5 8 13 21 34 55
    }

  }
}
