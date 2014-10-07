package com.sandbox.chapter22_DelimitedContinuations.theControlFlowOfResetAndShift

/**
 * Created by Jolin&Vash on 2014/10/7.
 */

import scala.util.continuations._

object theControlFlowOfResetAndShift {
  def main(args: Array[String]) {
    var cont : (Unit => Unit) = null
    reset {
      println("Before shift")
      shift {
        k : (Unit => Unit) => {
          cont = k
          println("Inside shift")
        }
      }
      println("After shift")
    }
    println("After reset")
    cont()
  }
}
