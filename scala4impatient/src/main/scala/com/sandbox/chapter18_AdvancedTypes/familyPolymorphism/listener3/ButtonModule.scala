package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener3

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
object ButtonModule extends ListenerSupport {
  type S = Button
  type E = ButtonEvent
  type L = ButtonListener

  class ButtonEvent extends Event

  trait ButtonListener extends Listener

  class Button extends Source {
    def click() { fire(new ButtonEvent) }
  }
}
