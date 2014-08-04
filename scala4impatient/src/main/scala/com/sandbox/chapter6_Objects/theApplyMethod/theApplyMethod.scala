package com.sandbox.chapter6_Objects.theApplyMethod

/**
 * Created by Jolin&Vash on 2014/8/5.
 */
object theApplyMethod {
  def main(args: Array[String]) {
    val array1 = Array.apply("Mary", "had", "a", "little", "lamb")
    println(array1.mkString(","))

    val array2 = Array(Array(1, 7), Array(2, 9))
    //
    for (row <- array2)
      print(row.mkString("[",",","]"))
    println()

    val array3 = Array[Int](9)
    println(array3.mkString(","))  // 9
    println(array3.length)         // 1

    val array4 = new Array[Int](10)
    array4(0) = 1
    println(array4.mkString(","))  // 1,0,0,0,0,0,0,0,0,0
    println(array4.length)         // 10
  }
}
