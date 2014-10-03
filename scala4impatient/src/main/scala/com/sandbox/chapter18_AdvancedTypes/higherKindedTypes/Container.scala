package com.sandbox.chapter18_AdvancedTypes.higherKindedTypes

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
trait Container[E] {
  def +=(e: E): Unit
}
