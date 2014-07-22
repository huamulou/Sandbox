package com.sandbox.chapter2_ControlStructuresAndFunctions.advLoopsAndComprehensions

/**
 * Created by jin1 on 2014/7/21.
 */
object advLoopsAndComprehensions {
  def main(args: Array[String]) {
    for (i <- 1 to 3; j <- 1 to 3)
      print((10 * i + j) + " ")  // 11 12 13 21 22 23 31 32 33
    println()

    for (i <- 1 to 3 if i != 1; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")  // 21 23 31 32
    println()

    for (i <- 1 to 3; from = 4 - i; j <- from to 3)
      print((10 * i + j) + " ")  //  13 22 23 31 32 33
    println()

    for { i <- 1 to 3
          from = 4 - i
          j <- from to 3 }
      print((10 * i + j) + " ")
    println()

    val vector1 = for (i <- 1 to 10) yield i % 3
    println(vector1) // Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

    // the collection generated by comprehensions is compatible with the first generator
    // here is String
    val str1 = for (c <- "Hello"; i <- 0 to 1)
                      yield (c + i).toChar
    println(str1.getClass.getName)  // HIeflmlmop
    println(str1)

    // the collection generated by comprehensions is compatible with the first generator
    // here is vector
    val vector2 = for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar
    println(vector2.getClass.getName)  // Vector(H, e, l, l, o, I, f, m, m, p)
    println(vector2)
  }
}
