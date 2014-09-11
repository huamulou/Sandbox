package com.sandbox.chapter13_Collections.commonMethods

/**
 * Created by jin1 on 2014/9/10.
 */
object commonMethods {
  def main(args: Array[String]) {
    val coll = Range(1, 10)
    println("head: " + coll.head)
    println("last: " + coll.last)
    println("headOption: " + coll.headOption)
    println("List().headOption: " + List().headOption)
    println("lastOption: " + coll.lastOption)

    println("length: " + coll.length)
    println("isEmpty: " + coll.isEmpty)

    println("sum: " + coll.sum)
    println("product: " + coll.product)
    println("max: " + coll.max)
    println("min: " + coll.min)

    println("count: " + coll.count(_ % 2 == 0))
    println("forall: " + coll.forall(_ % 2 == 0))
    println("exists: " + coll.exists(_ % 2 == 0))

    println("filter: " + coll.filter(_ % 2 == 0))
    println("filterNot: " + coll.filterNot(_ % 2 == 0))
    println("partition: " + coll.partition(_ % 2 == 0))

    println("takeWhile: " + coll.takeWhile(_ < 3))
    println("dropWhile: " + coll.dropWhile(_ < 3))
    println("span: " + coll.span(_ < 3))

    println("take: " + coll.take(4))
    println("drop: " + coll.drop(4))
    println("splitAt: " + coll.splitAt(4))

    println("takeRight: " + coll.takeRight(4))
    println("dropRight: " + coll.dropRight(4))

    println("slice: " + coll.slice(2, 8))

    println("grouped: " + coll.grouped(3).toArray.mkString(","))
    println("sliding: " + coll.sliding(3).toArray.mkString(","))

    println("mkString: " + coll.mkString("<", "|", ">"))


    println("toIterable: " + coll.toIterable)
    println("toSeq: " + coll.toSeq)
    println("toIndexedSeq: " + coll.toIndexedSeq)
    println("toArray: " + coll.toArray.mkString(","))
    println("toList: " + coll.toList)
    println("toSet: " + coll.toSet)

    // Seq methods

    println("indexWhere: " + coll.indexWhere(_ % 3 == 0))

    println("prefixLength: " + coll.prefixLength(_ % 4 != 0))
    println("segmentLength: " + coll.segmentLength(_ % 4 != 0, 4))
    println("padTo: " + coll.padTo(20, 0))

    val a = Seq(1, 1, 2, 3, 1, 1, 1)
    val b = Seq(1, 2, 3, 2, 1)

    println("intersect: " + a intersect b)
    println("diff: " + a diff b)

    val words = "Mary had a little lamb".split(" ")

    println("reverse: " + (words.reverse).mkString(" "))

    println("sorted: " + (words.sorted).mkString(" "))
    println("sortWith: " + (words.sortWith(_.length < _.length)).mkString(" "))
    println("sortBy: " + (words.sortBy(_.length)).mkString(" "))

    val permutationsItr = words.permutations
    println("==================== permutations ==========================")
    while(permutationsItr.hasNext) println(permutationsItr.next().mkString(" "))

    val combinationsItr = words.combinations(3)
    println("==================== combinations ==========================")
    while(combinationsItr.hasNext) println(combinationsItr.next().mkString(" "))
  }
}
