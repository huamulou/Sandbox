package com.sandbox.chapter13_Collections.sets

/**
 * Created by jin1 on 2014/9/10.
 */
object sets {
  def main(args : Array[String]){
    val set1 = Set(2, 0, 1) + 1
    val set2 = Set(2, 0, 1) + 4
    println(set1.mkString(","))  // 2,0,1
    println(set2.mkString(","))  // 2,0,1,4

    for (i <- Set(1, 2, 3, 4, 5, 6)) print(i + " ")  // 5 1 6 2 3 4
    println()

    val weekdays = scala.collection.mutable.LinkedHashSet("Mo", "Tu", "We", "Th", "Fr")
    println(weekdays.mkString(","))  // Mo,Tu,We,Th,Fr

    val sortedSet = collection.immutable.SortedSet(1, 2, 3, 4, 5, 6)
    println(sortedSet.mkString(","))  // 1,2,3,4,5,6

    val digits = Set(1, 7, 2, 9)
    digits contains 0 // false
    Set(1, 2) subsetOf digits // true

    val primes = Set(2, 3, 5, 7)

    // digits ++ primes
    // digits | primes
    // the union can be replaced as the either symbols above
    val unionSet = digits union primes
    println(unionSet.mkString(","))  // 5,1,9,2,7,3

    // digits intersect primes
    // the "&" symbol can be replaced as the "intersect" above
    val intersectSet = digits & primes
    println(intersectSet.mkString(","))  // 7,2

    // digits diff primes
    // digits &~ primes
    // the "--" symbol can be replaced as the "diff" or "&~" symbol above
    val diffSet = digits -- primes
    println(diffSet.mkString(","))  // 1,9
  }
}
