package com.sandbox.chapter14_PatternMatchingAndCaseClasses.matchingNestedStructures

/**
 * Created by jin1 on 2014/9/17.
 */

abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

object matchingNestedStructures {
  def main(args: Array[String]) {
    val special = Bundle("Father's day special", 20.0,
      Article("Scala for the Impatient", 39.95),
      Bundle("Anchor Distillery Sampler", 10.0,
        Article("Old Potrero Straight Rye Whiskey", 79.95),
        Article("Junípero Gin", 32.95)))

    val rv1 = special match {
      case Bundle(_, _, Article(descr, _), _*) => descr
    }
    println(rv1)  // Scala for the Impatient

    val rv2 = special match {
      case Bundle(_, _, art @ Article(_, _), rest @ _*) => (art, rest)
    }
    println(rv2)  // (Article(Scala for the Impatient,39.95),WrappedArray(Bundle(Anchor Distillery Sampler,10.0,WrappedArray(Article(Old Potrero Straight Rye Whiskey,79.95), Article(Junípero Gin,32.95)))))

    val rv3 = special match {
      case Bundle(_, _, art @ Article(_, _), rest) => (art, rest)
    }
    println(rv3)  // (Article(Scala for the Impatient,39.95),Bundle(Anchor Distillery Sampler,10.0,WrappedArray(Article(Old Potrero Straight Rye Whiskey,79.95), Article(Junípero Gin,32.95))))

    def price(it: Item): Double = it match {
      case Article(_, p) => p
      case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
    }

    val priceValue = price(special)
    println(priceValue)  // 122.85000000000002
  }
}
