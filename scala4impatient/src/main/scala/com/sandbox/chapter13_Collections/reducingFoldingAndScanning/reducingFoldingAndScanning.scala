package com.sandbox.chapter13_Collections.reducingFoldingAndScanning

/**
 * Created by jin1 on 2014/9/12.
 */
object reducingFoldingAndScanning {
  def main(args: Array[String]) {
    List(1, 7, 2, 9).reduceLeft(_ - _)  // ((1-7)-2)-9 = 1 - 7 - 2 -9 = -17

    List(1, 7, 2, 9).reduceRight(_ - _)  // 1-(7-(2-9)) = 1 - 7 + 2 - 9 = -13

    List(1, 7, 2, 9).foldLeft(0)(_ - _)  // 0 - 1 - 7 - 2 - 9 = -19

    (0 /: List(1, 7, 2, 9))(_ - _)  //  is equivalent to foldLeft

    val freq = scala.collection.mutable.Map[Char, Int]()
    for (c <- "Mississippi")
      freq(c) = freq.getOrElse(c, 0) + 1
    println(freq.mkString(","))  // M -> 1,s -> 4,p -> 2,i -> 4

    val anotherFreq = (Map[Char, Int]() /: "Mississippi") {
      (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
    }
    println(anotherFreq.mkString(","))  // M -> 1,i -> 4,s -> 4,p -> 2

    val vector = (1 to 10).scanLeft(0)(_ + _)
    println(vector.mkString(","))  // 0,1,3,6,10,15,21,28,36,45,55
  }
}
