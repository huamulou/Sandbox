package com.sandbox.chapter14_PatternMatchingAndCaseClasses.theOptionType

/**
 * Created by Jolin&Vash on 2014/9/18.
 */
object theOptionType {
  def main(args : Array[String]){
    val scores = Map("Alice" -> 1729, "Fred" -> 42)

    // it will print scala.Some which is the case class of Option class
    println(scores.get("Alice").getClass.getName)  // scala.Some

    scores.get("Alice") match {
      case Some(score) => println(score)  // 1729
      case None => println("No score")
    }

    val alicesScore = scores.get("Alice")
    if (alicesScore.isEmpty) { println("No score")
    } else println(alicesScore.get)  // 1729

    println(alicesScore.getOrElse("No score"))  // 1729

    println(scores.getOrElse("Alice", "No score"))  // 1729

    println(scores.getOrElse("Vash","No score"))  // No score

    for (score <- scores.get("Alice")) println(score)  // 1729

    scores.get("Alice").foreach(println _)  // 1729
  }
}
