package com.sandbox.chapter3_WorkingWithArrays.variableLengthArraysArrayBuffers

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/7/22.
 */
object variableLengthArraysArrayBuffers {
  def main(args: Array[String]) {
    val b = ArrayBuffer[Int]()
    val b2 = new ArrayBuffer[Int] // If you use new, the () is optional

    b += 1
    println(b)   //  ArrayBuffer(1)

    b += (1, 2, 3, 5)
    println(b)   //  ArrayBuffer(1, 1, 2, 3, 5)

    // you could use ++ to add collection
    b ++= Array(8, 13, 21)
    println(b)   //  ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)

    b.trimEnd(5)
    println(b)   //  ArrayBuffer(1, 1, 2)

    b.insert(2, 6)
    println(b)   //  ArrayBuffer(1, 1, 6, 2)

    b.insert(2, 7, 8, 9)
    println(b)   //  ArrayBuffer(1, 1, 7, 8, 9, 6, 2)

    b.remove(2)
    println(b)   //  ArrayBuffer(1, 1, 8, 9, 6, 2)

    b.remove(2, 3)
    println(b)   //  ArrayBuffer(1, 1, 2)

    val a = b.toArray
    println(a.isInstanceOf[Array[Int]])   // true

    val ab = a.toBuffer
    println(ab.getClass.getName)          // scala.collection.mutable.ArrayBuffer
  }
}
