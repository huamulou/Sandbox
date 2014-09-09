package com.sandbox.chapter13_Collections.sequences

/**
 * Created by jin1 on 2014/9/9.
 */
object sequences {
  def main(args: Array[String]) {
    val vec = (1 to 1000000) map (_ % 100)
    // map transforms a Range into a Vector
    val lst = vec.toList

    // time of get element by index
    def time[T](block: => T) = {
      val start = System.nanoTime
      val result = block
      val elapsed = System.nanoTime - start
      println(elapsed + " nanoseconds")
      result
    }

    // the apply function of Vector and List is that selects an element by its index in the vector or list
    time(vec(5000))

    time(lst(5000))
  }
}
