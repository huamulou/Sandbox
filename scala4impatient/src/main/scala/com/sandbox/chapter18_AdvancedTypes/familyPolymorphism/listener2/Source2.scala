package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener2

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Source2[S, E <: Event2[S], L <: Listener2[S, E]] {
  this: S =>
  private val listeners = new ArrayBuffer[L]
  def add(l: L) { listeners += l }
  def remove(l: L) { listeners -= l }
  def fire(e: E) {
    e.source = this // Self-type needed here
    for (l <- listeners) l.occurred(e)
  }
}
