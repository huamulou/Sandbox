package com.sandbox.chapter18_AdvancedTypes.infixTypes

/**
 * Created by jin1 on 2014/9/29.
 */
object infixTypes {
  def main(args: Array[String]) {
    val scores: String Map Int = Map("Fred" -> 42)
    val scores1: Map[String,Int] = Map("Fred" -> 42)

    type ×[A, B] = (A, B)
    type t[A,B] = (A,B)

    val pair: String × Int = ("Fred", 42)
    val pair1: Tuple2[String,Int] = ("Fred", 42)

    val triple: String × Int × Int = (("Fred", 42), 1729)
    val triple1:Tuple2[Tuple2[String,Int],Int] = (("Fred", 42), 1729)
  }
}
