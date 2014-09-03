package com.sandbox.chapter11_Operators.assignmentOperators

/**
 * Created by jin1 on 2014/9/3.
 */
object assignmentOperators {
  def main(args : Array[String]){
    var a: Any = 3
    a ->= 4 // Same as a = a -> 4
    println(a)  // (3,4)

    // Error; not the same as a = a == 4 because == starts with =
//    a === 4

    val b = scala.collection.mutable.Set(1, 2, 3)
    println(b)  // Set(1,2,3)
    b += 4 // Calls the += method; you couldn't use b = b + 4 with a val
    println(b)  // Set(1,2,3,4)
  }
}
