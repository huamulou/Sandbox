package com.sandbox.chapter21_Implicits.contextBounds

/**
 * Created by Jolin&Vash on 2014/10/5.
 */
class Pair1[T : Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) =
    if (ord.compare(first, second) < 0) first else second
}

class Pair2[T : Ordering](val first: T, val second: T) {
  def smaller =
    if (implicitly[Ordering[T]].compare(first, second) < 0) { first
    } else second
}

class Pair3[T : Ordering](val first: T, val second: T) {
  def smaller = {
    import Ordered._;
    if (first < second) first else second
  }
}

object contextBounds {
  def main(args: Array[String]) {
    val pair1 = new Pair1(40, 2).smaller
    val pair2 = new Pair2(40, 2).smaller
    val pair3 = new Pair3(40, 2).smaller

    import java.awt.Point

    // No ordering available.
    // And will prompt Exception:
    // Error:(33, 13) No implicit Ordering defined for java.awt.Point.println(new Pair1(new Point(3, 4), new Point(2, 5)).smaller)
//    println(new Pair1(new Point(3, 4), new Point(2, 5)).smaller)

    // organize an implicit value for Ordering[Point] which will conform to the context bounds of Pair1
    implicit object PointOrdering extends Ordering[Point] {
      def compare(a: Point, b: Point) =
        a.x * a.x + a.y * a.y - b.x * b.x + b.y * b.y
    }

    // Now there is an ordering available
    println(new Pair1(new Point(3, 4), new Point(2, 5)).smaller)

    // Namely this one
    implicitly[Ordering[Point]]

  }
}
