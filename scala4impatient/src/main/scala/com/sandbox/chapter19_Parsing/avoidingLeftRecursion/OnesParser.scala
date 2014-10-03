package com.sandbox.chapter19_Parsing.avoidingLeftRecursion

/**
 * Created by Jolin&Vash on 2014/10/3.
 */
import scala.util.parsing.combinator._

class OnesParser extends RegexParsers {
  def ones: Parser[Any] = ones ~ "1" | "1"
  // The following work:
  // def ones: Parser[Any] = "1" ~ ones | "1"
  // def ones: Parser[Any] = "1" ~ rep("1")
}
