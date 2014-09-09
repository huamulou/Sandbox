package com.sandbox.chapter12_HigherOrderFunctions.functionsWithFunctionParameters

import scala.math._

/**
 * Created by jin1 on 2014/9/4.
 */
object functionsWithFunctionParameters {
  def main(args : Array[String]){
    def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

    val v1 = valueAtOneQuarter(ceil _)
    println(v1) // 1.0

    val v2 = valueAtOneQuarter(sqrt _)
    println(v2)  // 0.5

    def mulBy1(factor : Double) = (x : Double) => factor * x

    val quintuple = mulBy1(5)
    val v3 = quintuple(20)
    println(v3)  // 100.0

    var v4 = 0. // 0. is equal to 0.0
    // return a function without any arguments
    def mulBy2(factor : Double) = () => { v4 = factor}

    val quintuple2 = mulBy2(5)
    println(v4)  // 0.0
    quintuple2()
    println(v4)  // 5.0
  }
}
