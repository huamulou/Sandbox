package com.sandbox.chapter9_FilesAndRegularExpressions.readingTokensAndNumbers

import scala.io.Source

/**
 * Created by jin1 on 2014/8/13.
 */
object readingTokensAndNumbers {
  def main(args: Array[String]) {
    val source2 = Source.fromFile("src/main/values.txt", "UTF-8")
    val tokens = source2.mkString.split("\\s+")
    println(tokens.getClass.getName)

    val numbers = tokens.map(_.toDouble)
//    val numbers = for (w <- tokens) yield w.toDouble
    println("Sum: " + numbers.sum)

    print("How old are you? ")
    val age = readInt()
    println("Next year, you will be " + (age + 1))
  }
}
