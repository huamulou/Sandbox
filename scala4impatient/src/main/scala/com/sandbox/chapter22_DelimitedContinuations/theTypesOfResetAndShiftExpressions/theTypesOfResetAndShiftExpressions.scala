package com.sandbox.chapter22_DelimitedContinuations.theTypesOfResetAndShiftExpressions

/**
 * Created by Jolin&Vash on 2014/10/7.
 */
import scala.util.continuations._

object theTypesOfResetAndShiftExpressions {
  def main(args: Array[String]) {
    val result = reset {
      if (scala.util.Random.nextBoolean()) {
        shift {

      /**
        This code won't compile. Can you identify the problem from the error message?

        $ scalac -P:continuations:enable Continuations.scala
        Continuations.scala:9: error: type mismatch;
         found   : Any @scala.util.continuations.cpsParam[Unit,java.lang.String]
         required: Any @scala.util.continuations.cpsParam[Any,java.lang.String]
            if (scala.util.Random.nextBoolean()) {
            ^
        one error found
      */
          // reset[B,C] shift[A,B,C]  see page 345
          //	        k: (Unit => Unit) => {

          k: (String => String) => {
            "Exit"
          }
        }
      }
      else "End"
    }

    println(result)
  }
}
