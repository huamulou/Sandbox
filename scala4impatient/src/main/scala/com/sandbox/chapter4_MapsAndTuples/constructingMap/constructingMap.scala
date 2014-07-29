package com.sandbox.chapter4_MapsAndTuples.constructingMap

/**
 * Created by jin1 on 2014/7/28.
 */
object constructingMap {
  def main(args: Array[String]) {
    // scores1 is a immutable map
    val scores1 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    println(scores1)  // Map(Alice -> 10, Bob -> 3, Cindy -> 8)

    val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    println(scores2)  // Map(Bob -> 3, Alice -> 10, Cindy -> 8)

    val scores3 = new scala.collection.mutable.HashMap[String, Int]
    println(scores3)  // Map()

    val scores4 = "Alice" -> 10
    println(scores4.getClass.getName)  // scala.Tuple2
    println(scores4)  // (Alice,10)

    val scores5 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
    println(scores5)  // Map(Alice -> 10, Bob -> 3, Cindy -> 8)
  }
}
