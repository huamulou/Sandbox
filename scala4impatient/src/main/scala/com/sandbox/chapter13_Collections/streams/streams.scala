package com.sandbox.chapter13_Collections.streams

/**
 * Created by Jolin&Vash on 2014/9/14.
 */
object streams {
  def main(args : Array[String]){
    def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)

    val tenOrMore = numsFrom(10)

    val v1 = tenOrMore.tail.tail.tail
    println(v1) // Stream(13, ?)

    val squares = numsFrom(1).map(x => x * x)
    val v2 = squares.take(5).force
    println(v2.mkString(","))  // 1,4,9,16,25

    import scala.io.Source

    val words = Source.fromFile("src/main/resources/mary.txt").getLines.toStream
    println(words)  // Stream(Mary had a little lamb,, ?)
    println(words(3))  //  And everywhere that Mary went,
    println(words)  //  Stream(Mary had a little lamb,, little lamb, little lamb,, Mary had a little lamb, its fleece was white as snow., And everywhere that Mary went,, ?)
  }
}
