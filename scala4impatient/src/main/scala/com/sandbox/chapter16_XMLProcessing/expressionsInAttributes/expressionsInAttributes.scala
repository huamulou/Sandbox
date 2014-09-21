package com.sandbox.chapter16_XMLProcessing.expressionsInAttributes

/**
 * Created by Jolin&Vash on 2014/9/22.
 */
import scala.xml._

object expressionsInAttributes {
  def main(args: Array[String]) {
    def makeURL(f: String) = "http://horstmann.com/" + f

    val fileName = "hamster.jpg"

    val img1 = <img src={makeURL(fileName)}/>
    println(img1)  // <img src="http://horstmann.com/hamster.jpg"/>

    val img2 = <img src="{makeURL(fileName)}"/>
    println(img2)  // <img src="{makeURL(fileName)}"/>

    val link = <a id={new Atom(1)}/>
    println(link)  // <a id="1"/>

    val description = "TODO"

    val img3 = <img alt={if (description == "TODO") null else description} src="hamster.jpg"/>
    println(img3)  // <img src="hamster.jpg"/>

    val img4 = <img alt={if (description == "TODO") None else Some(Text(description))} src="hamster.jpg"/>
    println(img4)  // <img src="hamster.jpg"/>

  }
}
