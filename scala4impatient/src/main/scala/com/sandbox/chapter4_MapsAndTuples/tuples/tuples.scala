package com.sandbox.chapter4_MapsAndTuples.tuples

/**
 * Created by jin1 on 2014/7/29.
 */
object tuples {
  def main(args: Array[String]) {
    (1, 3.14, "Fred")

    val t = (1, 3.14, "Fred")

    val second1 = t._2
    println(second1)  // 3.14

    val first1 = t _1;
    println(first1)   // 1

    val (first2, second2, third2) = t
    println(first2)   // 1
    println(second2)  // 3.14
    println(third2)   // Fred

    val (first3, second3, _) = t
    println(first3)   // 1
    println(second3)  // 3.14

    val couple = "New York".partition(_.isUpper)
    println(couple.getClass.getName)  // scala.Tuple2
    println(couple)  // (NY,ew ork)
  }
}
