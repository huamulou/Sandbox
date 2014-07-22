package com.sandbox.chapter1_TheBasics.applyMethod

/**
 * Created by jin1 on 2014/7/21.
 */
object applyMethod {
  def main(args: Array[String]) {
      val helloStr1 = "Hello".apply(4)
      // the apply name could be omitted
      val helloStr2 = "Hello"(4)
      println(helloStr1)    // o
      println(helloStr2)    // o

      // create an Array object by apply method
      val array = Array(1,4,9,16)
      println(array.length)  //4

  }
}
