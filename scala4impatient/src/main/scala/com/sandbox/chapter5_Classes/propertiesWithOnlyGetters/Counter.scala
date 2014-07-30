package com.sandbox.chapter5_Classes.propertiesWithOnlyGetters

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
class Counter {
  private var value = 0
  def increment = { value += 1 }
  def current = value // No () in declaration
}
