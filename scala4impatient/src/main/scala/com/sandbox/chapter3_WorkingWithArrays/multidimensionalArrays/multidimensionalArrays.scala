package com.sandbox.chapter3_WorkingWithArrays.multidimensionalArrays

/**
 * Created by Jolin&Vash on 2014/7/28.
 */
object multidimensionalArrays {
  def main(args: Array[String]) {
    val matrix = Array.ofDim[Double](3, 4) // An array of arrays

    val row = 0
    val column = 3

    matrix(row)(column) = 17.29

    matrix.length
    matrix(row) // An array
    matrix(row).length

    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i + 1)

    triangle(0)(0) = 1
    for (i <- 1 until triangle.length) {
      triangle(i)(0) = 1
      triangle(i)(i) = 1
      for (j <- 1 until triangle(i).length - 1)
        triangle(i)(j) = triangle(i - 1)(j - 1) + triangle(i - 1)(j)
    }

    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    // 1 5 10 10 5 1
    // 1 6 15 20 15 6 1
    // 1 7 21 35 35 21 7 1
    // 1 8 28 56 70 56 28 8 1
    // 1 9 36 84 126 126 84 36 9 1
    for (row <- triangle) {
      for (elem <- row) print(elem + " ")
      println()
    }
  }
}
