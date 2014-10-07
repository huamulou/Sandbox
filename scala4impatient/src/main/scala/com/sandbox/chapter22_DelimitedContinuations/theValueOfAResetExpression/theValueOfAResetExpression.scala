package com.sandbox.chapter22_DelimitedContinuations.theValueOfAResetExpression

/**
 * Created by Jolin&Vash on 2014/10/7.
 */
import scala.util.continuations._

object theValueOfAResetExpression {
  def main(args: Array[String]) {
    val result1 = reset { shift { k: (String => String) => "Exit" }; "End" }
    println(result1) // Exit

    val result2 = reset { if (false) shift { k: (String => String) => "Exit" }; else "End" }
    println(result2)  // End

    val result = reset {
      if (scala.util.Random.nextBoolean()) {
        shift {
          k: (String => String) => {
            "Exit"
          }
        }
      }
      else "End"
    }

    println(result)  // "Exit" or "End"
  }
}
