package com.sandbox.chapter19_Parsing.generatingParseTrees

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._

class Expr
case class Number(value: Int) extends Expr
case class Operator(op: String, left: Expr, right: Expr) extends Expr

class ExprParser extends RegexParsers {
  val number = "[0-9]+".r

  // Can't discard the "+" or "-" since they are needed in the match
  def expr: Parser[Expr] = term ~ opt(("+" | "-") ~ expr) ^^ {
    case t ~ None => t
    case t ~ Some(op ~ e) => Operator(op, t, e)
  }

  def term: Parser[Expr] = (factor ~ opt("*" ~> term)) ^^ {
    case a ~ None => a
    case a ~ Some(b) => Operator("*", a, b)
  }

  def factor: Parser[Expr] = number ^^ { n => Number(n.toInt) } | "(" ~> expr <~ ")"
}

object generatingParseTrees {
  def main(args: Array[String]) {
    val parser = new ExprParser
    val result = parser.parseAll(parser.expr, "3-4*5")
    if (result.successful) println(result.get)
  }
}
