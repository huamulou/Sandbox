package com.sandbox.chapter11_Operators.extractors

/**
 * Created by jin1 on 2014/9/3.
 */
object extractors {
  def main(args : Array[String]){
    val author = "Cay Horstmann"

    val Name(first, last) = author // calls Name.unapply(author)
    println(first)  // Cay
    println(last)  // Horstmann

    println(Name.unapply(author))  // Some((Cay,Horstmann))
    println(Name.unapply("Anonymous"))  // None

    case class Currency(value: Double, unit: String)
    // See Chapter 14 for case classes
    val amt = Currency(29.95, "EUR")
    amt match {
      case Currency(amount, "USD") => println("$" + amount)
      case Currency(amount, "EUR") => println("€" + amount)  // €29.95
      case _ => println(amt)
    }

    var Fraction(a, b) = Fraction(3, 4) * Fraction(2, 5)
    println(a)  // 3
    println(b)  // 10
  }
}
