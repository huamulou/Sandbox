package com.sandbox.chapter18_AdvancedTypes.higherKindedTypes

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
class Buffer[E : Manifest] extends Iterable[E, Buffer] with Container[E] {
  private var capacity = 10
  private var length = 0
  private var elems = new Array[E](capacity) // See note
  def iterator() = new Iterator[E] {
      private var i = 0
      def hasNext = i < length
      def next() = { i += 1; elems(i - 1) }
    }
  def build[F : Manifest]() = new Buffer[F]
  def +=(e: E) {
    if (length == capacity) {
      capacity = 2 * capacity
      val nelems = new Array[E](capacity) // See note
      for (i <- 0 until length) nelems(i) = elems(i)
      elems = nelems
    }
    elems(length) = e
    length += 1
  }
}
