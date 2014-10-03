package com.sandbox.chapter19_Parsing.packratParsers

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._
import scala.util.parsing.input.CharSequenceReader

object packratParsers {
  class OnesParser extends RegexParsers {
    def ones: Parser[Any] = "1" ~ ones | "1"
  }

  class OnesPackratParser extends RegexParsers with PackratParsers {
    lazy val ones: PackratParser[Any] = ones ~ "1" | "1"
    def parseAll[T](p: Parser[T], input: String) =
      phrase(p)(new PackratReader(new CharSequenceReader(input)))
  }

  def main(args: Array[String]) {
    val parser = new OnesParser
    val input = "11111"
    println(parser.parseAll(parser.ones, input))

    val pparser = new OnesPackratParser
    println(pparser.parseAll(pparser.ones, input))
  }
}
