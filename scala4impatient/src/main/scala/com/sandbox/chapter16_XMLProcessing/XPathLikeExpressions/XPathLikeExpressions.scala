package com.sandbox.chapter16_XMLProcessing.XPathLikeExpressions

/**
 * Created by Jolin&Vash on 2014/9/22.
 */
object XPathLikeExpressions {
  def main(args : Array[String]){
    val list = <dl><dt>Java</dt><dd>Gosling</dd><dt>Scala</dt><dd>Odersky</dd></dl>
    val languages = list \ "dt"
    // <dt>Java</dt>,<dt>Scala</dt>
    println(languages.mkString(","))

    val doc = <html><head><title>Lists and an image</title></head><body>
                  <ul><li>Fred</li><li>Wilma</li></ul>
                  <ul><li>Java</li><li>Scala</li></ul>
                  <ul><li>Frog</li><li>Hamster<img src="hamster.jpg" alt="image of a hamster"/></li></ul>
              </body></html>

    val rv1 = doc \ "body" \ "_" \ "li"

    // <li>Fred</li>,<li>Wilma</li>,<li>Java</li>,<li>Scala</li>,<li>Frog</li>,<li>Hamster<img src="hamster.jpg" alt="image of a hamster"/></li>
    println(rv1.mkString(","))

    val img = doc \\ "img"
    // return the attribute value of "alt" of specified node
    val rv2 = img \ "@alt"
    println(rv2.mkString(","))  // image of a hamster

    // return the attribute values of all "alt" of any node in doc
    val rv3 = doc \\ "@alt"
    println(rv3.mkString(","))  // image of a hamster

    // return the attribute values of each "alt" of all any img node
    val rv4 = doc \\ "img" \\ "@alt"
    println(rv4.mkString(","))  // image of a hamster

    // <img src="hamster.jpg" alt="image of a hamster"/>
    for (n <- doc \\ "img") println(n)

    println((<img src="hamster.jpg"/><img src="frog.jpg"/> \\ "@src").text)  // hamster.jpgfrog.jpg
  }
}
