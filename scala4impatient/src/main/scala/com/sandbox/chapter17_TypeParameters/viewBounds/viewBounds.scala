package com.sandbox.chapter17_TypeParameters.viewBounds

/**
 * Created by Jolin&Vash on 2014/9/23.
 */
class Pair1[T <% Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
  override def toString = "(" + first + "," + second + ")"
}

// Ordered is nicer--< instead of compareTo
class Pair2[T <% Ordered[T]](val first: T, val second: T) {
  def smaller = if (first < second) first else second
  override def toString = "(" + first + "," + second + ")"
}

object viewBounds {
  def main (args: Array[String]) {
    val p1 = new Pair1(4, 2) // Works
    println(p1.smaller)  // 2

    val p2 = new Pair2(4, 2)
    println(p2.smaller)  // 2

    val ap2 = new Pair2("Fred", "Brooks")
    println(ap2.smaller)  // Brooks
  }
}
