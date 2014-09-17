package com.sandbox.chapter14_PatternMatchingAndCaseClasses.infixNotationInCaseClauses

/**
 * Created by jin1 on 2014/9/17.
 */
case class Currency(value: Double, unit: String)

object infixNotationInCaseClauses {
  def main(args: Array[String]) {
    val amt = Currency(1000.0, "EUR")
    // is equivalent to: amt match { case Currency(a,u) => a + " " + u }
    amt match { case a Currency u => a + " " + u }

    val lst = List(1, 7, 2, 9)
    lst match {
      case h :: t => {h + t.length;println(h);println(t.length)}
      case _ => 0
    }
    // is equivalent to the code above
    lst match {
      case ::(h, t) => h + t.length
      case _ => 0
    }

    // ~ matches parse results
    val parser = new scala.util.parsing.combinator.RegexParsers {
      val amount = "[0-9]+".r ~ "[A-Z]{3}".r

      def parse(in: String) = {
        val result = parseAll(amount, in).get
        println(result.getClass.getName)  // scala.util.parsing.combinator.Parsers$$tilde
        println(result)  // (1000~EUR)
        result match {
          case p ~ q => Currency(p.toDouble, q) // same as case ~(p, q)
        }
      }
    }
    val currency = parser.parse("1000 EUR")
    println("value = " + currency.value)  // value = 1000.0
    println("unit = " + currency.unit)  // unit = EUR

    // :: is right-associative
    List(1, 7, 2, 9) match {
      case first :: second :: rest => first + second + rest.length
      case _ => 0
    }
    // is equivalent to the code above
    List(1, 7, 2, 9) match {
      case ::(first, ::(second, rest)) => first + second + rest.length
      case _ => 0
    }

    List(List(1, 7), List(2, 9)) match {
      case (first :: second) :: rest => first + second.length + rest.length
      case _ => 0
    }

    // Infix notation works with any binary unapply--doesn't have to
    // come from case class
    case object +: {
      def unapply[T](input: List[T]) =
        if (input.isEmpty) None else Some((input.head, input.tail))
    }
    // it will invoke +:.unapply(1 +: 7 +: 2 +: 9 +: Nil)
    1 +: 7 +: 2 +: 9 +: Nil match {
      case first +: second +: rest => first + second + rest.length
    }
  }
}
