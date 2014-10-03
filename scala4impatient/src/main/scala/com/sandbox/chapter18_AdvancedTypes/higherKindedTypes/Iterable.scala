package com.sandbox.chapter18_AdvancedTypes.higherKindedTypes

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Iterable[E, C[X] <: Container[X]] {
  def iterator(): Iterator[E]
  def build[F : Manifest](): C[F]

  def map[F : Manifest](f: (E) => F): C[F] = {
    val res = build[F]()
    val iter = iterator()
    while (iter.hasNext) res += f(iter.next())
    res
  }
}
