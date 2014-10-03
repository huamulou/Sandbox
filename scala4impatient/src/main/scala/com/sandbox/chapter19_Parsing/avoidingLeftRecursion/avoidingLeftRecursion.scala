package com.sandbox.chapter19_Parsing.avoidingLeftRecursion

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._

class ExprParser extends RegexParsers {
  val number = "[0-9]+".r

  def expr: Parser[Int] = term ~ rep(
    ("+" | "-") ~ term ^^ {
      case "+" ~ t => t
      case "-" ~ t => -t
    }) ^^ { case t ~ r => t + r.sum }

  def term: Parser[Int] = factor ~ rep("*" ~> factor) ^^ {
    case f ~ r => f * r.product
  }

  def factor: Parser[Int] = number ^^ { _.toInt } | "(" ~> expr <~ ")"
}

object avoidingLeftRecursion {
  def main(args: Array[String]) {
    val parser1 = new OnesParser()
    parser1.parseAll(parser1.ones, "111")

    val parser2 = new ExprParser
    val result = parser2.parseAll(parser2.expr, "3-4-5")
    if (result.successful) println(result.get)

  }
}
