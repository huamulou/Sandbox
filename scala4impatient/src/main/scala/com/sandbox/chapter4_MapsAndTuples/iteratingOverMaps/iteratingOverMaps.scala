package com.sandbox.chapter4_MapsAndTuples.iteratingOverMaps

/**
 * Created by jin1 on 2014/7/29.
 */
object iteratingOverMaps {
  def main(args: Array[String]) {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    for ((k, v) <- scores)
      // Alice is mapped to 10
      // Bob is mapped to 3
      // Cindy is mapped to 8
      println(k + " is mapped to " + v)

    val keySet = scores.keySet
    println(keySet)  // Set(Alice, Bob, Cindy)

    for (v <- scores.values)
      print(v + " ")  // 10 3 8
    println()

    val reversedMap = for ((k, v) <- scores) yield (v, k)
    println(reversedMap)  // Map(10 -> Alice, 3 -> Bob, 8 -> Cindy)
  }
}
