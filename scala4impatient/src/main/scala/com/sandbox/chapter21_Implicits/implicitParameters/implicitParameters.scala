package com.sandbox.chapter21_Implicits.implicitParameters

/**
 * Created by Jolin&Vash on 2014/10/4.
 */
case class Delimiters(left: String, right: String)

object FrenchPunctuation {
  implicit val quoteDelimiters = Delimiters("#", "#")
}

object implicitParameters {
  def quote(what: String)(implicit delims: Delimiters) =
    delims.left + what + delims.right

  def main(args: Array[String]) {
    val rv1= quote("Bonjour le monde")(Delimiters("«", "»"))
    println(rv1)  // «Bonjour le monde»

    import FrenchPunctuation._
    // import FrenchPunctuation.quoteDelimiters

    val rv2 = quote("Bonjour le monde")
    println(rv2)  // #Bonjour le monde#

  }
}
