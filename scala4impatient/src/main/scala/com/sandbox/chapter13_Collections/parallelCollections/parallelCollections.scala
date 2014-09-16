package com.sandbox.chapter13_Collections.parallelCollections

/**
 * Created by jin1 on 2014/9/16.
 */
object parallelCollections {
  def main(args: Array[String]) {
    val coll = (1 to 1000000).map(BigInt(_))

    coll.par.sum

    coll.par.count(_ % 2 == 0)

    // the result is not sequential
    for (i <- (0 until 100).par) print(i + " ")
    println()

    // the result is sequential
    val v1 = for (i <- (0 until 100).par) yield i + " "
    println(v1.mkString(" "))

    // Don't do this:
    var count = 0
    for (c <- coll.par) { if (c % 2 == 0) count += 1 }
    count


    // Associative fold and aggregate
    val str = (1 to 1000).par.map(_.toString).fold("")(_ + _)
    println(str)  // 123456789101112131415161718192021222324252627282930313233343536373839404142434............
    val set = str.par.aggregate(Set[Char]())(_ + _, _ ++ _)
    println(set)  // Set(8, 4, 9, 5, 6, 1, 0, 2, 7, 3)
  }
}
