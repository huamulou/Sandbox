package com.sandbox.chapter12_HigherOrderFunctions.functionsAsValues

import scala.math._
/**
 * Created by jin1 on 2014/9/4.
 */
object functionsAsValues {
  def main(args : Array[String]){
    val num = 3.14
    val fun = ceil _

    println(fun(num))  // 4.0

    println(Array(3.14, 1.42, 2.0).map(fun).mkString(","))  // 4.0,2.0,2.0

  }
}
