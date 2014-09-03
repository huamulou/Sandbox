package com.sandbox.chapter11_Operators.extractorsWithOneOrNoArguments

/**
 * Created by jin1 on 2014/9/3.
 */
object extractorsWithOneOrNoArguments {
  def main(args: Array[String]) {
    val Number(n) = "1729"
    println(n)

    val author = "Peter van der Linden"
    author match {
      case Name(first, last @ IsCompound()) => {
        println(first)
        println(last)
        println(last.split("\\s+").length)
      }
      // Matches if the author is Peter van der Linden
      case Name(first, last) => println("1")
    }

  }
}
