package com.sandbox.chapter16_XMLProcessing.uncommonNodeTypes

/**
 * Created by Jolin&Vash on 2014/9/22.
 */
import xml._

/**
 *  ignore all the compile error in Intellij IDE
 * */
object uncommonNodeTypes {
  def main(args : Array[String]){
    val js1 = <script><![CDATA[if (temp < 0) alert("Cold!")]]></script>
    println(js1)  // <script>if (temp &lt; 0) alert(&quot;Cold!&quot;)</script>

    val code = """if (temp < 0) alert("Cold!")"""
    val js2 = <script>{PCData(code)}</script>
    println(js2)  // <script><![CDATA[if (temp < 0) alert("Cold!")]]></script>

    val n1 = <xml:unparsed><&></xml:unparsed>
    val n2 = Unparsed("<&>")
    println(n1)  // <&>
    println(n2)  // <&>

    val g1 = <xml:group><li>Item 1</li><li>Item 2</li></xml:group>
    val g2 = Group(Seq(<li>Item 1</li>, <li>Item 2</li>))
    println(g1)  // <li>Item 1</li><li>Item 2</li>
    println(g2)  // <li>Item 1</li><li>Item 2</li>

    val items = <li>Item 1</li><li>Item 2</li>;

    // Yields two li elements
    val rv1 = for (n <- <xml:group>{items}</xml:group>) yield n
    println(rv1.size)  // 2
    println(rv1.mkString(","))  // <li>Item 1</li>,<li>Item 2</li>

    // Yields one ol element
    val rv2 = for (n <- <ol>{items}</ol>) yield n
    println(rv2.size)  // 1
    println(rv2.mkString(","))  // <ol><li>Item 1</li><li>Item 2</li></ol>

  }
}
