package com.sandbox.chapter2_ControlStructuresAndFunctions.function

/**
 * Created by Jolin&Vash on 2014/7/21.
 */
object function {
  def main(args: Array[String]) {
    def abs(x: Double) = if (x >= 0) x else -x
    println(abs(3))   // 3.0
    println(abs(-3))  // 3.0

    def fac(n : Int) = {
      var r = 1
      for (i <- 1 to n) r = r * i
      r
    }
    println(fac(4))  // 24

    def recursiveFac(n: Int): Int =
      if (n <= 0) 1 else n * recursiveFac(n - 1)

    println(recursiveFac(4))  // 24

  }
}
