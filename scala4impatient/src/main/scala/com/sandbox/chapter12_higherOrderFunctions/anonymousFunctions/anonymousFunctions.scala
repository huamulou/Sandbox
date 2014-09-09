package com.sandbox.chapter12_HigherOrderFunctions.anonymousFunctions

/**
 * Created by jin1 on 2014/9/4.
 */
object anonymousFunctions {
  def main(args : Array[String]){
//      (x: Double) => 3 * x

      val triple = (x: Double) => 3 * x

      val a1 = Array(3.14, 1.42, 2.0).map(triple)
      println(a1.mkString(","))  // 9.42,4.26,6.0

      val a2 = Array(3.14, 1.42, 2.0).map((x: Double) => 2 * x)
      println(a2.mkString(","))  // 6.28,2.84,4.0

      val a3 = Array(3.14, 1.42, 2.0) map { (x: Double) => 1 * x }
      println(a3.mkString(","))  // 3.14,1.42,2.0
  }
}
