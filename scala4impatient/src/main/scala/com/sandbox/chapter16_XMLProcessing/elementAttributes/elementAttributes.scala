package com.sandbox.chapter16_XMLProcessing.elementAttributes

import scala.xml.Text

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
object elementAttributes {
  def main(args: Array[String]) {
    val elem = <a href="http://scala-lang.org">The Scala language</a>
    val url1 = elem.attributes("href")
    val url2 = elem.attributes("href").text
    val url3 = elem.attributes.get("href").getOrElse(Text(""))

    // ignore the compile error in Intellij IDE
    val image1 = <img alt="San Jos&eacute; State University Logo" src="http://www.sjsu.edu/publicaffairs/pics/sjsu_logo_color_web.jpg"/>
    val alt = image1.attributes("alt")

    for (attr <- elem.attributes)
      println(attr.key + "=" + attr.value.text)

    val image2 = <img alt="TODO" src="hamster.jpg"/>
    val map = image2.attributes.asAttrMap
  }
}
