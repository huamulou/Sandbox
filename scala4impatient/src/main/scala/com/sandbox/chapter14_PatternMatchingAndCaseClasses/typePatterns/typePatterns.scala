package com.sandbox.chapter14_PatternMatchingAndCaseClasses.typePatterns

/**
 * Created by jin1 on 2014/9/17.
 */
object typePatterns {
  def main(args: Array[String]) {
    for (obj <- Array(42, "42", BigInt(42), BigInt, 42.0)) {

      val result = obj match {
        case x: Int => x
        case s: String => Integer.parseInt(s)
        case _: BigInt => Int.MaxValue
        case BigInt => -1
        case _ => 0
      }
//      42
//      42
//      2147483647
//      -1
//      0
      println(result)
    }

    for (obj <- Array(Map("Fred" -> 42), Map(42 -> "Fred"), Array(42), Array("Fred"))) {

      val result = obj match {
        case m: Map[String, Int] => "It's a Map[String, Int]"

        // Warning: Won't work because of type erasure
        case m: Map[Int, String] => "It's a Map[Int, String]"
        // but you can use a general match pattern
        case m: Map[_, _] => "It's a map"

        case a: Array[Int] => "It's an Array[Int]"
        case a: Array[_] => "It's an array of something other than Int"
        case _ => "default"
      }
//      It's a Map[String, Int]
//      It's a Map[String, Int]
//      It's an Array[Int]
//      It's an array of something other than Int
      println(result)
    }
  }
}
