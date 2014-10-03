package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener2

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Listener2[S, E <: Event2[S]] {
  def occurred(e: E): Unit
}
