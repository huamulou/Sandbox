package com.sandbox.chapter14_PatternMatchingAndCaseClasses.sealedClasses

/**
 * Created by Jolin&Vash on 2014/9/17.
 */
object sealedClasses {
  def main(args: Array[String]) {
    def show(amt: Amount) =
    // You will get a "match not exhaustive" warning.
    // That warning is not there if Amount isn't sealed.
      amt match {
        case Currency(v, u) => "I have " + v + " " + u
      }

    println(show(Currency(100000, "JPY")))
  }
}
