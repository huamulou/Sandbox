package com.sandbox.chapter12_HigherOrderFunctions.usefulHigherOrderFunctions

/**
 * Created by jin1 on 2014/9/4.
 */
object usefulHigherOrderFunctions {
  def main(args : Array[String]){
    val v1 = (1 to 9).map(0.1 + _).mkString(", ")
    println(v1) // 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1

//    *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******
//    ********
//    *********
    (1 to 9).map("*" * _).foreach(println _)

    val v2 = (1 to 9).filter(_ % 2 == 0).mkString(", ")
    println(v2)  // 2, 4, 6, 8

    val v3 = (1 to 9).reduceLeft(_ * _) // this line of code is equals to (...((1 * 2) * 3) * ... * 9)
    println(v3)  // 362880

    val v4 = "Mary had a little lamb".split(" ").sortWith(_.length < _.length).mkString(" ")
    println(v4)  // a had Mary lamb little
  }
}
