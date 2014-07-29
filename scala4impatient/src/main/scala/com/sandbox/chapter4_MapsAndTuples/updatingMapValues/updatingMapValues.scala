package com.sandbox.chapter4_MapsAndTuples.updatingMapValues

/**
 * Created by jin1 on 2014/7/29.
 */
object updatingMapValues {
  def main(args: Array[String]) {
    val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    scores1("Bob") = 10
    scores1("Fred") = 7
    println(scores1)  // Map(Bob -> 10, Fred -> 7, Alice -> 10, Cindy -> 8)

    val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    scores2 += ("Bob" -> 10, "Fred" -> 7)
    println(scores2)  // Map(Bob -> 10, Fred -> 7, Alice -> 10, Cindy -> 8)
    scores2 -= "Alice"
    println(scores2)  // Map(Bob -> 10, Fred -> 7, Cindy -> 8)


    val scores3 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val newScores = scores3 + ("Bob" -> 10, "Fred" -> 7) // New map with update
    println(scores3)  // Map(Alice -> 10, Bob -> 3, Cindy -> 8)

    // you can use var to accept the new map with update
    var scores4 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    scores4 = scores4 + ("Bob" -> 10, "Fred" -> 7)
    println(scores4)  // Map(Alice -> 10, Bob -> 10, Cindy -> 8, Fred -> 7)
    scores4 = scores4 - "Alice"
    println(scores4)  // Map(Bob -> 10, Cindy -> 8, Fred -> 7)
  }
}
