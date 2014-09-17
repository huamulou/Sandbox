package com.sandbox.chapter14_PatternMatchingAndCaseClasses.partialFunctions

/**
 * Created by Jolin&Vash on 2014/9/18.
 */
object partialFunctions {
  def main(args: Array[String]) {
    val f: PartialFunction[Char, Int] = { case '+' => 1 ; case '-' => -1 }
    val intValue = f('-')
    println(intValue)  // -1

    val empty = f.isDefinedAt('0')
    println(empty)  // false


    // Throws MatchError
//    f('0')

    val vector = "-3+4".collect { case '+' => 1 ; case '-' => -1 }
    println(vector.getClass.getName)  // scala.collection.immutable.Vector
    println(vector.mkString(","))  // -1,1
  }
}
