package com.sandbox.chapter13_Collections.iterators

/**
 * Created by Jolin&Vash on 2014/9/14.
 */
object iterators {
  def main(args : Array[String]){
    val iter1 = (1 to 10).sliding(3)

    //    Vector(1, 2, 3)
    //    Vector(2, 3, 4)
    //    Vector(3, 4, 5)
    //    Vector(4, 5, 6)
    //    Vector(5, 6, 7)
    //    Vector(6, 7, 8)
    //    Vector(7, 8, 9)
    //    Vector(8, 9, 10)
    while (iter1.hasNext)
      println(iter1.next())

    val iter2 = (1 to 10).sliding(3)

    //    Vector(1, 2, 3)
    //    Vector(2, 3, 4)
    //    Vector(3, 4, 5)
    //    Vector(4, 5, 6)
    //    Vector(5, 6, 7)
    //    Vector(6, 7, 8)
    //    Vector(7, 8, 9)
    //    Vector(8, 9, 10)
    for (elem <- iter2)
      println(elem)

    val iter3 = (1 to 10).sliding(3)

    println(iter3.length)  // 8

    //The iterator is now consumed and it can't be used any more
    println(iter3.hasNext) // false

    val iter4 = (1 to 10).sliding(3)

    val array = iter4.toArray
    println(array.mkString(","))  // Vector(1, 2, 3),Vector(2, 3, 4),Vector(3, 4, 5),Vector(4, 5, 6),Vector(5, 6, 7),Vector(6, 7, 8),Vector(7, 8, 9),Vector(8, 9, 10)

    val iter5 = (1 to 10).sliding(3)
    val iterable = iter5.toIterable
    println(iterable)  // Stream(Vector(1, 2, 3), ?)
  }
}
