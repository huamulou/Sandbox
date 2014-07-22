package com.sandbox.chapter1_TheBasics.functionInvoke
import scala.math._


/**
 * Created by Jolin&Vash on 2014/7/19.
 */
object functionInvoke {
  def main(args: Array[String]) {
    val rvSqrt = sqrt(2)
    val rvPow = pow(2,4)
    val rvMin = min(2,4)
    val num = BigInt.probablePrime(100,scala.util.Random)
    val str = "Hello".distinct
    val patchedStr = "Harry".patch(1,"ung",2)
    println(rvSqrt)  //1.4142135623730951
    println(rvPow)   //16.0
    println(rvMin)   //2
    println(num)     //659429356655432188646173242293
    println(str)     //Helo
    println(patchedStr)   //Hungry
  }
}
