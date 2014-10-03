package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener3

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait ListenerSupport {
  type S <: Source
  type E <: Event
  type L <: Listener

  trait Event {
    var source: S = _
  }

  trait Listener {
    def occurred(e: E): Unit
  }

  trait Source {
    this: S =>

    private val listeners = new ArrayBuffer[L]
    def add(l: L) { listeners += l }
    def remove(l: L) { listeners -= l }
    def fire(e: E) {
      e.source = this
      for (l <- listeners) l.occurred(e)
    }
  }
}
