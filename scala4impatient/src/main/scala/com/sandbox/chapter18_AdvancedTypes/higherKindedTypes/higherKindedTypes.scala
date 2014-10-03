package com.sandbox.chapter18_AdvancedTypes.higherKindedTypes

import scala.math._

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
object higherKindedTypes {
  def main(args: Array[String]) {
    val names = new Buffer[String]
    names += "Fred"
    names += "Linda"
    val lengths = names.map(_.length)
    lengths.map(println(_))
    new Range(1, 10).map(sqrt(_)).map(println(_))
  }
}
