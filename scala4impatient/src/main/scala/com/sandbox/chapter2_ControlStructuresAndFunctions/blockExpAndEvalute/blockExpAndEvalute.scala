package com.sandbox.chapter2_ControlStructuresAndFunctions.blockExpAndEvalute
import scala.math._
/**
 * Created by jin1 on 2014/7/21.
 */
object blockExpAndEvalute {
  def main(args: Array[String]) {
    var x = 1
    var y = 2
    var x0 = 3
    var y0 = 4
    val distance = { val dx = x - x0; val dy = y - y0; sqrt(dx * dx + dy * dy)}
    println(distance)  // 2.8284271247461903
  }
}
