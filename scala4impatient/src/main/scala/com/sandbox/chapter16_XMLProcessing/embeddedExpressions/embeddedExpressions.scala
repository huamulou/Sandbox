package com.sandbox.chapter16_XMLProcessing.embeddedExpressions

/**
 * Created by Jolin&Vash on 2014/9/22.
 */

import scala.xml._

object embeddedExpressions {
  def main(args : Array[String]){
    val items = Array("Fred", "Wilma")
    val lst1 = <ul><li>{items(0)}</li><li>{items(1)}</li></ul>

    val containsAtoms = <p>{42}{"Fred"}{Text("Wilma")}</p>
    for (n <- containsAtoms.child) {
      // scala.xml.Atom: 42
      // scala.xml.Atom: Fred
      // scala.xml.Text: Wilma
      println(n.getClass.getName + ": " + n)
    }

    val lst2 = <ul>{for (i <- items) yield <li>{i}</li>}</ul>
    println(lst2)  // <ul><li>Fred</li><li>Wilma</li></ul>

    val lst3 = <h1>The Natural Numbers {{1, 2, 3, ...}}</h1>
    println(lst3)  // <h1>The Natural Numbers {1, 2, 3, ...}</h1>
  }
}
