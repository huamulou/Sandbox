package com.sandbox.chapter2_ControlStructuresAndFunctions.procedures

/**
 * Created by jin1 on 2014/7/22.
 */
object procedures {

  /**
   *    you can also defined this procedure like this:
   *      def box(s : String) : Unit = {
   *        ...
   *      }
   * */
  def box(s : String) { // Look carefully: no =
    val border = "-" * s.length + "--\n"
    println("\n" + border + "|" + s + "|\n" + border)
  }

  def main(args: Array[String]) {
    box("Fred")
    box("Wilma")
  }
}
