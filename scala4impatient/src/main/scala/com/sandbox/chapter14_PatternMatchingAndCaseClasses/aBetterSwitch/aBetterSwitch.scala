package com.sandbox.chapter14_PatternMatchingAndCaseClasses.aBetterSwitch

/**
 * Created by Jolin&Vash on 2014/9/16.
 */
object aBetterSwitch {
  def main(args: Array[String]) {
    var sign = 0
    for (ch <- "+-!") {

      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ => sign = 0
      }

      println(sign)
    }

    for (ch <- "+-!") {

      sign = ch match {
        case '+' => 1
        case '-' => -1
        case _ => 0
      }
      println(sign)
    }


    import java.awt._

    val color = SystemColor.textText
    color match {
      case Color.RED => println("Text is red")
      case Color.BLACK => println("Text is black")
      case _ => println("Not red or black")
    }
  }
}
