package com.sandbox.chapter13_Collections.reducingFoldingAndScanning

/**
 * Created by jin1 on 2014/9/12.
 */
object reducingFoldingAndScanning {
  def main(args: Array[String]) {
    List(1, 7, 2, 9).reduceLeft(_ - _)  // ((1-7)-2)-9 = 1 - 7 - 2 -9 = -17

    List(1, 7, 2, 9).reduceRight(_ - _)  // 1-(7-(2-9)) = 1 - 7 + 2 - 9 = -13

    List(1, 7, 2, 9).foldLeft(0)(_ - _)  // 0 - 1 - 7 - 2 - 9 = -19

    val rv1 = List(1, 7, 2, 9).foldLeft("")(_ + _)
    println("rv1 " + rv1)  // 1729

    val rv2 =  ("" /: List(1, 7, 2, 9))((_1,_2) => _1 + _2)  //  is equivalent to foldLeft
    println("rv2 " + rv2)  // 1729

    val freq = scala.collection.mutable.Map[Char, Int]()
    for (c <- "Mississippi")
      freq(c) = freq.getOrElse(c, 0) + 1
    println(freq.mkString(","))  // M -> 1,s -> 4,p -> 2,i -> 4

    // Map()
    // Map(M -> 1)
    // Map(M -> 1, i -> 1)
    // Map(M -> 1, i -> 1, s -> 1)
    // Map(M -> 1, i -> 1, s -> 2)
    // Map(M -> 1, i -> 2, s -> 2)
    // Map(M -> 1, i -> 2, s -> 3)
    // Map(M -> 1, i -> 2, s -> 4)
    // Map(M -> 1, i -> 3, s -> 4)
    // Map(M -> 1, i -> 3, s -> 4, p -> 1)
    // Map(M -> 1, i -> 3, s -> 4, p -> 2)
    val anotherFreq = (Map[Char, Int]() /: "Mississippi") {
      (m, c) => {println(m);m + (c -> (m.getOrElse(c, 0) + 1))}
    }
    println(anotherFreq.mkString(","))  // M -> 1,i -> 4,s -> 4,p -> 2

    val vector = (1 to 10).scanLeft(0)(_ + _)
    println(vector.mkString(","))  // 0,1,3,6,10,15,21,28,36,45,55
  }
}
