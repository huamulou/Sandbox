package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener1

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Source1[E, L <: Listener1[E]] {
  private val listeners = new ArrayBuffer[L]
  def add(l: L) { listeners += l }
  def remove(l: L) { listeners -= l }
  def fire(e: E) {
    for (l <- listeners) l.occurred(e)
  }
}
