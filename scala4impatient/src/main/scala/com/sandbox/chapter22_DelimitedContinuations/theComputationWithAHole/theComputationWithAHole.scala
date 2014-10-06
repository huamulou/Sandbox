package com.sandbox.chapter22_DelimitedContinuations.theComputationWithAHole

/**
 * Created by Jolin&Vash on 2014/10/5.
 */
import scala.util.continuations._

object theComputationWithAHole {
  def main(args : Array[String]){
    var cont : (Int => Double) = null
    reset {
      0.5 * shift {
        k: (Int => Double) => {
          cont = k
        }
      } + 1
    }
    // cont is an function with the definition: x:Int => 0.5 * x + 1
    println(cont(10))  // 6.0
    println(cont(20))  // 11.0
  }
}
