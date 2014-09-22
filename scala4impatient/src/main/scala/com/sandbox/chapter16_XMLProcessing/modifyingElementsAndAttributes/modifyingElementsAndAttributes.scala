package com.sandbox.chapter16_XMLProcessing.modifyingElementsAndAttributes

/**
 * Created by jin1 on 2014/9/22.
 */
object modifyingElementsAndAttributes {
  def main (args: Array[String]) {
    // Change the element
    val list = <ul><li>Fred</li><li>Wilma</li></ul>
    val list2 = list.copy(label = "ol")
    println(list2)  // <ol><li>Fred</li><li>Wilma</li></ol>

    // Add a child
    val list3 = list.copy(child = list.child ++ <li>Another item</li>)
    println(list3)  // <ul><li>Fred</li><li>Wilma</li><li>Another item</li></ul>

    // Add or change an attribute
    import scala.xml._

    val image = <img src="hamster.jpg"/>
    val image2 = image % Attribute(null, "alt", "An image of a hamster", Null)
    println(image2)  // <img alt="An image of a hamster" src="hamster.jpg"/>

    // Add multiple attributes
    val image3 = image % Attribute(null, "alt", "An image of a frog",
      Attribute(null, "src", "frog.jpg", Null))
    println(image3)  // <img src="frog.jpg" alt="An image of a frog"/>
  }
}
