package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener2

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
class Button2 extends Source2[Button2, ButtonEvent2, ButtonListener2] {
  def click() { fire(new ButtonEvent2) }
}
