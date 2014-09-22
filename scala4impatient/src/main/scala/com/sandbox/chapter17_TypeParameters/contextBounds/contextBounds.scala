package com.sandbox.chapter17_TypeParameters.contextBounds

/**
 * Created by Jolin&Vash on 2014/9/23.
 */

class Pair[T : Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) =
    if (ord.compare(first, second) < 0) first else second
  override def toString = "(" + first + "," + second + ")"
}

object contextBounds {
  def main(args: Array[String]) {
    val p = new Pair(4, 2)
    println(p.smaller)  // 2

    val q = new Pair("Fred", "Brooks")
    println(q.smaller)  // Brooks
  }
}
