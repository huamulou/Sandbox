package com.sandbox.chapter13_Collections.operatorsForAddingOrRemovingElements

/**
 * Created by jin1 on 2014/9/10.
 */
object operatorsForAddingOrRemovingElements {
  def main(args: Array[String]) {
    val v1 = Vector(1, 2, 3) :+ 5
    val v2 = 1 +: Vector(1, 2, 3)
    println(v1.mkString(","))  // 1,2,3,5
    println(v2.mkString(","))  // 1,1,2,3

    import scala.collection.mutable.ArrayBuffer

    val numbers1 = ArrayBuffer(1, 2, 3)
    numbers1 += 5
    println(numbers1.mkString(","))  // 1,2,3,5

    var numbers2 = Set(1, 2, 3)
    numbers2 += 5 // Sets numbers to the immutable set numbers + 5
    println(numbers2.mkString(","))  // 1,2,3,5

    val set = Set(1, 2, 3) - 2
    println(set.mkString(","))  // 1,3

    val v3 = numbers2 ++ Vector(1, 2, 7, 9)
    println(v3.mkString(","))  // 5,1,9,2,7,3

    val v4 = numbers2 -- Vector(1, 2, 7, 9)
    println(v4.mkString(","))  // 3,5
  }
}
