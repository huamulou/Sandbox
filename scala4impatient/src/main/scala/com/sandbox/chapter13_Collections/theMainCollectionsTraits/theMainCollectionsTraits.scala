package com.sandbox.chapter13_Collections.theMainCollectionsTraits

/**
 * Created by jin1 on 2014/9/9.
 */
object theMainCollectionsTraits {
  def main(args : Array[String]){
    val coll = Array(1, 7, 2, 9) // some Iterable
    val iter = coll.iterator
    while (iter.hasNext)
      println(iter.next())

    import java.awt.Color

    Iterable(0xFF, 0xFF00, 0xFF0000)
    Set(Color.RED, Color.GREEN, Color.BLUE)
    Map(Color.RED -> 0xFF0000, Color.GREEN -> 0xFF00, Color.BLUE -> 0xFF)
    Vector(1)

    import scala.collection._

    SortedSet("Hello", "World")
  }
}
