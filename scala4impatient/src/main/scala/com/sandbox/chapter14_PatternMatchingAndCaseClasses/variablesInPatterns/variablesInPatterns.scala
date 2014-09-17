package com.sandbox.chapter14_PatternMatchingAndCaseClasses.variablesInPatterns

/**
 * Created by Jolin&Vash on 2014/9/17.
 */
object variablesInPatterns {
  def main(args: Array[String]) {
    val str = "+-3!"
    for (i <- 0 until str.length) {
      var sign = 0
      var digit = 0

      str(i) match {
        case '+' => sign = 1
        case '-' => sign = -1
        case ch if Character.isDigit(ch) => digit = Character.digit(ch, 10)
        case _ =>
      }

      println(str(i) + " " + sign + " " + digit)
    }

    import scala.math._
    val x = random
    x match {
      case Pi => println("It's Pi")
      case _ => println("It's not Pi")
    }

    import java.io.File._
    str match {
      case `pathSeparator` => println("It's the path separator")
      case _ => println("It's not the path separator")
    }
  }
}
