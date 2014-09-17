package com.sandbox.chapter14_PatternMatchingAndCaseClasses.guards

/**
 * Created by Jolin&Vash on 2014/9/17.
 */
object guards {
  def main(args : Array[String]){
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0

      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if Character.isDigit(ch) => digit = Character.digit(ch, 10)
        case _ => sign = 0
      }

      println(ch + " " + sign + " " + digit)
    }
  }
}
