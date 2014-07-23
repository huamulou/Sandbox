package com.sandbox.chapter3_WorkingWithArrays.transformingArrays

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/7/24.
 */
object transformingArrays {

  def removeAllNegativesExceptTheFirst(a: ArrayBuffer[Int]) = {
    var first = true
    var n = a.length
    var i = 0
    while (i < n) {
      if (a(i) >= 0) i += 1
      else {
        if (first) { first = false; i += 1 }
        else { a.remove(i); n -= 1 }
      }
    }
  }

  def anotherRemoveAllNegativesExceptTheFirst(a: ArrayBuffer[Int]) = {
    val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
    // to remove the specified elem in "a" ArrayBuffer, you have to remove from the rear idx, otherwise it will throw out of boundary exception
    for (j <- (1 until indexes.length).reverse) a.remove(indexes(j))
  }

  def main(args: Array[String]) {
    val a = Array(2, 3, 5, 7, 11)
    val result1 = for (elem <- a) yield 2 * elem
    for(v <- result1)
      print(v + " ")   //  4 6 10 14 22
    println()

    val result2 = for (elem <- a if elem % 2 == 0) yield 2 * elem
    for(v <- result2)
      print(v + " ")   //  4
    println()

    val b = ArrayBuffer(1, -2, -3, 4, -5)
    removeAllNegativesExceptTheFirst(b)
    println(b)   //  ArrayBuffer(1, -2, 4)

    val c = ArrayBuffer(1, -2, -3, 4, -5)
    anotherRemoveAllNegativesExceptTheFirst(c)
    println(c)   //  ArrayBuffer(1, -2, 4)
  }
}
