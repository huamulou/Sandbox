package com.sandbox.chapter18_AdvancedTypes.higherKindedTypes

/**
 * Created by Jolin&Vash on 2014/10/3.
 */

// An iterable, but not a container
class Range(val low: Int, val high: Int) extends Iterable[Int, Buffer] {
  def iterator() = new Iterator[Int] {
    private var i = low
    def hasNext = i <= high
    def next() = { i += 1; i - 1 }
  }
  def build[F : Manifest]() = new Buffer[F]
  // Produced collection need not be the same type
}
