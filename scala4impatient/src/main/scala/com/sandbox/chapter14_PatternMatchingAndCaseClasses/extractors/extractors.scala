package com.sandbox.chapter14_PatternMatchingAndCaseClasses.extractors

/**
 * Created by jin1 on 2014/9/17.
 */
object extractors {
  def main(args: Array[String]) {
    val arr = Array(0, 1)

    arr match {
      case Array(0, x) => x
    }

    val array1 = Array.unapplySeq(arr).toArray
    println(array1(0).mkString(","))  // 0,1

    val pattern = "([0-9]+) ([a-z]+)".r
    var rv = (0,"")
    "99 bottles" match {
      case pattern(num, item) => rv = (num.toInt, item)
    }
    println(rv)  // (99,bottles)

    val array2 = pattern.unapplySeq("99 bottles").toArray
    println(array2(0).mkString(","))  // 99,bottles
  }
}
