package com.sandbox.chapter4_MapsAndTuples.accessingMapValues

/**
 * Created by jin1 on 2014/7/28.
 */
object accessingMapValues {
  def main(args: Array[String]) {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    val bobsScore = scores("Bob")
    println(bobsScore)  // 3

    val fredsScore = if (scores.contains("Fred")) scores("Fred") else 0
    println(fredsScore)  // 0

    val aliceScore = scores.getOrElse("Alice", 0)
    println(aliceScore)  // 10

    // the get method will return a Option object which is Some type or None type
    println(scores.get("Bob").getClass.getName)
    println(scores.get("Bob"))  // Some(3)
    println(scores.get("Fred"))  // None
  }
}
