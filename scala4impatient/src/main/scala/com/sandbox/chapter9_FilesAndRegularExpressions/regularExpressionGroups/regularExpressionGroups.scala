package com.sandbox.chapter9_FilesAndRegularExpressions.regularExpressionGroups

/**
 * Created by jin1 on 2014/8/22.
 */
object regularExpressionGroups {
  def main(args: Array[String]) {
    val numitemPattern = "([0-9]+) ([a-z]+)".r

    val numitemPattern(num, item) = "99 bottles"

    for (numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles"))
      println(item + ": " + num)
  }
}
