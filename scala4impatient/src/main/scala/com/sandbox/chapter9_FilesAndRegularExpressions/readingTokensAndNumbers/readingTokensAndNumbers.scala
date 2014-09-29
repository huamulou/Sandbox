package com.sandbox.chapter9_FilesAndRegularExpressions.readingTokensAndNumbers

import scala.io.Source

/**
 * Created by jin1 on 2014/8/13.
 */
object readingTokensAndNumbers {
  def main(args: Array[String]) {
    val source = Source.fromFile("src/main/resources/values.txt", "UTF-8")
    val tokens = source.mkString.split("\\s+")

    val numbers = tokens.map(_.toDouble)
//    val numbers = for (w <- tokens) yield w.toDouble
    println("Sum: " + numbers.sum)

    source.close()

    print("How old are you? ")
    val age = readInt()
    println("Next year, you will be " + (age + 1))
  }
}
