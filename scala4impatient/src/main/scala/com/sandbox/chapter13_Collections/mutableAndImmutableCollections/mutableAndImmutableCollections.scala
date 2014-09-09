package com.sandbox.chapter13_Collections.mutableAndImmutableCollections

/**
 * Created by jin1 on 2014/9/9.
 */
object mutableAndImmutableCollections {
  def digits(n: Int): Set[Int] =
    if (n < 0) { digits(-n)
    } else if (n < 10) { Set(n)
    } else digits(n / 10) + (n % 10)

  def main(args : Array[String]){
    val immutableMap: collection.immutable.Map[String, Int] =
      Map("Hello" -> 42) // Nobody can change it

    //    import scala.collection.mutable
    //    val mutableMap = new mutable.HashMap[String, Int]  // same as below mutalbeMap declaration
    val mutableMap = new collection.mutable.HashMap[String, Int]

    val map: collection.Map[String, Int] = mutableMap

    mutableMap.put("Wilma", 17)
//    map.put("Fred", 29) // Error

    val anotherImmutableMap = Map("Hello" -> 42)

    val it = digits(1729).iterator
    while(it.hasNext){
      println(it.next())
    }
  }
}
