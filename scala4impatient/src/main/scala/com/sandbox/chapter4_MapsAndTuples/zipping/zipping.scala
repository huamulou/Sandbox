package com.sandbox.chapter4_MapsAndTuples.zipping

/**
 * Created by jin1 on 2014/7/29.
 */
object zipping {
  def main(args: Array[String]) {
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    println(pairs(0).getClass.getName)  // scala.Tuple2
    println(pairs.mkString(" "))  // (<,2) (-,10) (>,2)

    for ((s, n) <- pairs)
      Console.print(s * n)  // <<---------->>
    println()

    val map = symbols.zip(counts).toMap
    println(map.getClass.getName)  // scala.collection.immutable.Map$Map3
    println(map)  // Map(< -> 2, - -> 10, > -> 2)
  }
}
