package com.sandbox.chapter1.functionInvoke
import scala.math._


/**
 * Created by Jolin&Vash on 2014/7/19.
 */
object functionInvoke {
  def main(args: Array[String]) {
    val rvSqrt = sqrt(2)
    val rvPow = pow(2,4)
    val rvMin = min(2,4)
    println(rvSqrt)  //1.4142135623730951
    println(rvPow)   //16.0
    println(rvMin)   //2
  }
}
