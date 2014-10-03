package com.sandbox.chapter18_AdvancedTypes.familyPolymorphism

/**
 * Created by jin1 on 2014/9/30.
 */
import java.awt.event.ActionEvent

import com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener1.{ActionListener1, Button1}
import com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener2.{ButtonEvent2, ButtonListener2, Button2}
import com.sandbox.chapter18_AdvancedTypes.familyPolymorphism.listener3.ButtonModule

object familyPolymorphism {
  def listener1 = {
    val b = new Button1
    b.add(new ActionListener1 {
      def occurred(e: ActionEvent) {
        println(e)
      }
    })
    b.click()
  }

  def listener2 = {
    val b = new Button2
    b.add(new ButtonListener2 {
      def occurred(e: ButtonEvent2) {
        println(e + " from " + e.source)
      }
    })
    b.click()
  }

  def listener3 = {
    import ButtonModule._

    val b = new Button
    b.add(new ButtonListener {
      def occurred(e: ButtonEvent) {
        println(e + " from " + e.source)
      }
    })
    b.click()
  }

  def main(args: Array[String]) {
    listener1
    listener2
    listener3
  }
}
