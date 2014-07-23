package com.sandbox.chapter3_WorkingWithArrays.fixedLengthArrays

/**
 * Created by Jolin&Vash on 2014/7/22.
 */
object fixedLengthArrays {
  def main(args: Array[String]) {
    val nums = new Array[Int](10)

    val a = new Array[String](10)

    val s = Array("Hello", "World")
    s(0) = "Goodbye"
    for(str <- s)
      println(str)   // Goodby \n World \n
  }
}
