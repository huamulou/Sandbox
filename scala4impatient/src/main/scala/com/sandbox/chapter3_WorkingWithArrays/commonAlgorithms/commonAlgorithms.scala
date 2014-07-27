package com.sandbox.chapter3_WorkingWithArrays.commonAlgorithms

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/7/27.
 */
object commonAlgorithms {
  def main(args: Array[String]) {
    val sumValue = Array(1, 7, 2, 9).sum
    println(sumValue)  // 19

    val maxValue = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
    println(maxValue)  // little

    val b = ArrayBuffer(1, 7, 2, 9)
    val bSorted = b.sorted
    val bDesSorted = b.sortWith(_ > _)
    //the sorted function won't mutate the original Array or ArrayBuffer
    println(b.toString)  // ArrayBuffer(1, 7, 2, 9)
    println(bSorted)     // ArrayBuffer(1, 2, 7, 9)
    println(bDesSorted)  // ArrayBuffer(9, 7, 2, 1)

    val a = Array(1, 7, 2, 9)
    scala.util.Sorting.quickSort(a)
    println(a.mkString(" and "))  // 1 and 2 and 7 and 9

    println(a.mkString("<", ",", ">"))  // <1,2,7,9>

    println(a.toString)  // [I@3fdd7880

    println(b.toString)  // ArrayBuffer(1, 7, 2, 9)
  }
}
