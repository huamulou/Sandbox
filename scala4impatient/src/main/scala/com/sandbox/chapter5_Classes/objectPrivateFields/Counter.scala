package com.sandbox.chapter5_Classes.objectPrivateFields

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
class Counter {
  private var value = 0
  def increment() { value += 1 }

  def isLess(other : Counter) = value < other.value
  // Can access private field of other object
}
