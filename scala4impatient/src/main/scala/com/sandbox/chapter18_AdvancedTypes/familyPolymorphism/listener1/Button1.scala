package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener1

import java.awt.event.ActionEvent

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
class Button1 extends Source1[ActionEvent, ActionListener1] {
  def click() {
    fire(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "click"))
  }
}
