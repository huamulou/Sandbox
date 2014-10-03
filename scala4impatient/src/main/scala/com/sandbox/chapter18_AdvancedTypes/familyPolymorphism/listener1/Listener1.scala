package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener1

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Listener1[E] {
  def occurred(e: E): Unit
}
