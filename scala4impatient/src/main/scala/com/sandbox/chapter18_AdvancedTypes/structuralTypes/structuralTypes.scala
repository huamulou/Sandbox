package com.sandbox.chapter18_AdvancedTypes.structuralTypes

/**
 * Created by jin1 on 2014/9/29.
 */
object structuralTypes {
  def main(args: Array[String]) {
    def appendLines(target: { def append(str: String): Any }, lines: Iterable[String]) {
      for (l <- lines) { target.append(l); target.append("\n") }
    }

    val lines = Array("Mary", "had", "a", "little", "lamb")

    val builder = new StringBuilder
    appendLines(builder, lines)
    //  Mary
    //  had
    //  a
    //  little
    //  lamb
    println(builder)

    import javax.swing._

    val area = new JTextArea(20, 20)
    appendLines(area, lines)

    val frame = new JFrame
    frame.add(area)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.pack()
    frame.setVisible(true)
  }
}
