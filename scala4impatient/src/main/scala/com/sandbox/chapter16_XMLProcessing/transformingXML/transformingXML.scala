package com.sandbox.chapter16_XMLProcessing.transformingXML

/**
 * Created by jin1 on 2014/9/22.
 */

import scala.xml._
import scala.xml.transform._

object transformingXML {
  def main(args: Array[String]) {
    val rule1 = new RewriteRule {
      override def transform(n: Node) = n match {
        case e @ <ul>{_*}</ul> => e.asInstanceOf[Elem].copy(label = "ol")
        case _ => n
      }
    }

    val root = <html><head><title>A List</title></head><body><ul>
      <li>Fred</li><li>Wilma</li></ul></body></html>

    val transformed1 = new RuleTransformer(rule1).transform(root)
    // <html><head><title>A List</title></head><body><ol>
    //       <li>Fred</li><li>Wilma</li></ol></body></html>
    println(transformed1)

    val rule2 = new RewriteRule {
      override def transform(n: Node) = n match {
        case Text("Fred") => Text("Frog")
        case _ => n
      }
    }
    val transformed2 = new RuleTransformer(rule1, rule2).transform(root)
    // <html><head><title>A List</title></head><body><ol>
    //       <li>Frog</li><li>Wilma</li></ol></body></html>
    println(transformed2)

  }
}
