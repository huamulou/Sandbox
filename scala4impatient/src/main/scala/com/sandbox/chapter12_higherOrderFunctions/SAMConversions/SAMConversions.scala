package com.sandbox.chapter12_HigherOrderFunctions.SAMConversions

import java.awt.event.{ActionListener, ActionEvent}
import javax.swing.{JFrame, JButton}

/**
 * Created by jin1 on 2014/9/5.
 */
object SAMConversions {
  def main(args: Array[String]) {
    var counter = 0

    val button = new JButton("Increment")
//    button.addActionListener(new ActionListener {
//      override def actionPerformed(event: ActionEvent) {
//        counter += 1
//      }
//    })

    // the implicit defined method is equal to the snippet commented code above
    implicit def makeAction(action: (ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(event: ActionEvent) { action(event) }
      }

    button.addActionListener((event: ActionEvent) => counter += 1)
    button.addActionListener((event: ActionEvent) => {println(counter);println(event.getActionCommand)})
    button.addActionListener((event: ActionEvent) => if (counter > 9) System.exit(0))

    val frame = new JFrame
    frame.add(button)
    frame.pack()
    frame.setVisible(true)
  }
}
