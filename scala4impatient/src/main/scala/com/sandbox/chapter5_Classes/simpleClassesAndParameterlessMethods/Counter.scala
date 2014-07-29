package com.sandbox.chapter5_Classes.simpleClassesAndParameterlessMethods

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}
