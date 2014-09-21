package com.sandbox.chapter16_XMLProcessing.XMLNodes

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
object XMLNodes {
  def main(args: Array[String]) {
    val elem1 = <a href="http://scala-lang.org">The <em>Scala</em> language</a>

    for (n <- elem1.child) {
      println(n.getClass.getName + ": " + n)
    }

    val elem2 = <p><!-- a comment -->&anEntityRef;<?a processingInstruction ?></p>

    for (n <- elem2.child) {
      // scala.xml.Text: The
      // scala.xml.Elem: <em>Scala</em>
      // scala.xml.Text:  language
      // scala.xml.Comment: <!-- a comment -->
      // scala.xml.EntityRef: &anEntityRef;
      // scala.xml.ProcInstr: <?a processingInstruction ?>
      println(n.getClass.getName + ": " + n)
    }

    import scala.xml._

    val items = new NodeBuffer
    items += <li>Fred</li>
    items += <li>Wilma</li>
    val nodes: NodeSeq = items
  }
}
