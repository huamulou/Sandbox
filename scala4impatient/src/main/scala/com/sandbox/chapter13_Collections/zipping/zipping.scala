package com.sandbox.chapter13_Collections.zipping

/**
 * Created by Jolin&Vash on 2014/9/14.
 */
object zipping {
  def main(args: Array[String]) {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)

    val v1 =  prices zip quantities
    println(v1.mkString(","))  // (5.0,10),(20.0,2),(9.95,1)

    val v2 = (prices zip quantities) map { p => p._1 * p._2 }
    println(v2.mkString(","))  // 50.0,40.0,9.95

    val v3 = (((prices zip quantities) map { p => p._1 * p._2 }) sum)
    println(v3)  // 99.95

    val v4 = List(5.0, 20.0, 9.95) zip List(10, 2)
    println(v4.mkString(","))  // (5.0,10),(20.0,2)

    val v5 = List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
    println(v5.mkString(","))  // (5.0,10),(20.0,2),(9.95,1)

    val v6 = "Scala".zipWithIndex
    println(v6.mkString(","))  // (S,0),(c,1),(a,2),(l,3),(a,4)

    val v7 = "Scala".zipWithIndex.max
    println(v7)  // (l,3)

    val v8 = "Scala".zipWithIndex.max._2
    println(v8)  // 3
  }
}
