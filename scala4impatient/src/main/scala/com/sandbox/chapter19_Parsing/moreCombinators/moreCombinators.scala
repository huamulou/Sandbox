package com.sandbox.chapter19_Parsing.moreCombinators

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

  def term: Parser[Int] = factor into { first =>
    rep("*" ~> factor) ^^ { first * _.product }
  }

  def factor: Parser[Int] = log(number)("number") ^^ { _.toInt } | "(" ~> expr <~ ")"
}

object moreCombinators {
  def main(args: Array[String]) {
    val parser1 = new ExprParser
    val result = parser1.parseAll(parser1.expr, "3-4*5")
    if (result.successful) println(result.get)

    val parser2 = new MiscParser
    println(parser2.parseAll(parser2.numberList, "3,4,5").get)
    println(parser2.parseAll(parser2.bounds, "[3][4][5]").get)
    println(parser2.parseAll(parser2.coords, "3 4 5 10").get)
    println(parser2.parseAll(parser2.prod, "3*4*5").get)
    println(parser2.parseAll(parser2.fun, "f(3, 4, 5)").get)
  }
}
