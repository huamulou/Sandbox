package com.sandbox.chapter19_Parsing.avoidingBacktracking

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._

class ExprParser extends RegexParsers {
  val number = "[0-9]+".r
  def expr: Parser[Any] = term ~! opt(("+" | "-") ~! expr)
  def term: Parser[Any] = factor ~! rep("*" ~! factor)
  def factor: Parser[Any] = "(" ~! expr ~! ")" | number
}

object avoidingBacktracking {
  def main(args: Array[String]) {
    val parser = new ExprParser
    val result = parser.parseAll(parser.expr, "(3+4)*5")
    if (result.successful) println(result.get)
  }
}
