package com.sandbox.chapter19_Parsing.moreCombinators

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._

class MiscParser extends RegexParsers {
  val number = "[0-9]+".r
  val ident = "[A-Za-z][A-Za-z0-9]*".r
  def numberList = repsep(number, ",")
  def bounds = rep1("[" ~> number <~ "]")
  def coords = repN(4, number)
  def prod = chainl1(number ^^ { _.toInt }, "*" ^^^ { (x: Int, y: Int) => x * y })
  def fun = guard(ident ~ "(") ~> (ident <~ "(") ~ numberList <~ ")"
}

