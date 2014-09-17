package com.sandbox.chapter14_PatternMatchingAndCaseClasses.caseClasses

/**
 * Created by jin1 on 2014/9/17.
 */
abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

object caseClasses {
  def main(args: Array[String]) {
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(_, u) => "Oh noes, I got " + u
        case Nothing => ""
      }
      // Note that amt is printed nicely, thanks to the generated toString
      println(amt + ": " + result)
    }
  }
}
