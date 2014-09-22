package com.sandbox.chapter16_XMLProcessing.patternMatching

/**
 * Created by jin1 on 2014/9/22.
 */
object patternMatching {
  def main(args : Array[String]){
    // Match a node with no children
    val node1 = <img src="hamster.jpg"/>

    node1 match {
      case <img/> => node1 \ "@src"
      case <a/> => node1 \ "@href"
    }

    // Match a node with one child
    val node2 = <li>Harry</li>

    node2 match {
      case <li>{_}</li> => "It's a li with one child"
    }

    // Match a node with children
    val node3 = <li>an <em>important</em> item</li>

    node3 match {
      case <li>{_}</li> => "It's a li with one child"
      case <li>{_*}</li> => "It's a li"
    }

    // Bind the match to a variable
    val node4 = <li>Harry</li>

    node4 match {
      case <li>{child}</li> => child.text
    }

    import scala.xml._

    node4 match {
      case <li>{Text(item)}</li> => item
    }

    val node5 = <li>an <em>important</em> item</li>

    node5 match {
      case <li>{child}</li> => child
      case <li>{children @ _*}</li> => for (c <- children) yield c
    }

    // Match an attribute
    val node6 = <img src="hamster.jpg" alt="TODO"/>

    node6 match {
      case n @ <img/> if (n.attributes("alt").text == "TODO") => node6 \ "@src"
    }
  }
}
