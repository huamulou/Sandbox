package com.sandbox.chapter14_PatternMatchingAndCaseClasses.patternsInForExpressions

/**
 * Created by jin1 on 2014/9/17.
 */
object patternsInForExpressions {
  def main(args: Array[String]) {
    import scala.collection.JavaConversions.propertiesAsScalaMap
    // Converts Java Properties to a Scala map—just to get an interesting example
    for ((k, v) <- System.getProperties())
      println(k + " -> " + v)
    println("=======================================================================================================")

    // the failed match will be skipped silently and print the key mapping with empty value
    for ((k, "") <- System.getProperties())
      println(k)
    println("=======================================================================================================")

    // it is equivalent to the code above via using guard( if v == "" )
    for ((k, v) <- System.getProperties() if v == "")
      println(k)

  }
}
