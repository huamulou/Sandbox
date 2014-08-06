package com.sandbox.chapter7_PackagesAndImports.imports

/**
 * Created by jin1 on 2014/8/6.
 */
object imports {
  def main(args: Array[String]) {
    // import Color class under java.awt
    import java.awt.Color

    Color.RED

    // import all classes under java.awt package
    import java.awt._

    Font.BOLD

    // import all the members variables and methods of java.awt.Color
    import java.awt.Color._
    val c1 = RED // Color.RED
    val c2 = decode("#ff0000")

    import java.awt._

    def handler(evt: event.ActionEvent) { // java.awt.event.ActionEvent
      println(evt)
      System.exit(0)
    }

    val frame = new javax.swing.JFrame
    val button = new javax.swing.JButton("Exit")
    frame.add(button)
    button.addActionListener(new event.ActionListener {
      override def actionPerformed(evt: event.ActionEvent) {
        handler(evt)
      }
    })
    frame.pack
    frame.setVisible(true)
  }
}
