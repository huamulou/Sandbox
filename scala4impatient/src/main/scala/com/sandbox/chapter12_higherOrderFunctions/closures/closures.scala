package com.sandbox.chapter12_HigherOrderFunctions.closures

/**
 * Created by jin1 on 2014/9/4.
 */
object closures {
  def main(args: Array[String]) {
    def mulBy(factor : Double) = (x : Double) => factor * x

    val triple = mulBy(3)
    val half = mulBy(0.5)
    println(triple(14) + " " + half(14))
  }
}
