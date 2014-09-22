package com.sandbox.chapter17_TypeParameters.genericClasses

/**
 * Created by jin1 on 2014/9/22.
 */
import scala.xml._

object genericClasses {
  def main(args: Array[String]) {
    val node = <svg:svg width="100" height="100">
      <svg:rect x="25" y="25" width="50" height="50" fill="#ff0000"/>
    </svg:svg>

    val scope = new NamespaceBinding("svg", "http://www.w3.org/2000/svg", TopScope)
    val attrs = Attribute(null, "width", "100",
      Attribute(null, "height", "100", Null))
    val elem = Elem(null, "body", Null, TopScope,
      Elem("svg", "svg", attrs, scope))
  }
}
