package com.sandbox.chapter5_Classes.propertiesWithGettersAndSetters

/**
 * Created by Jolin&Vash on 2014/7/30.
 */
class AnotherPerson {
  private var privateAge = 0 // Make private and rename
  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue; // Can’t get younger
  }
}
