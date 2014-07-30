package com.sandbox.chapter5_Classes.objectPrivateFields

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
class AnotherCounter {
  private[this] var value = 0
  def increment() { value += 1 }

  // Can't access private[this] field of other object
  //def isLess(other : Counter) = value < other.value

}
