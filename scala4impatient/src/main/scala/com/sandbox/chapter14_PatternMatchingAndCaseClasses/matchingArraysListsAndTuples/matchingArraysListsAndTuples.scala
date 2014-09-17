package com.sandbox.chapter14_PatternMatchingAndCaseClasses.matchingArraysListsAndTuples

/**
 * Created by jin1 on 2014/9/17.
 */
object matchingArraysListsAndTuples {
  def main(args: Array[String]) {
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0))) {

      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + " " + y
        case Array(0, _*) => "0 ..."
        case _ => "something else"
      }
//      0
//      1 0
//      0 ...
//      something else
      println(result)
    }

    for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(1,1,0))) {

      val result = lst match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0 ..."
        case head :: 0 :: tail => "... 0 ..."
        case _ => "something else"
      }
//      0
//      1 0
//      0 ...
//      ... 0 ...
//      something else
      println(result)
    }

    for (pair <- Array((0, 1), (1, 0), (1, 1))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y + " 0"
        case _ => "neither is 0"
      }
//      0 ...
//      1 0
//      neither is 0
      println(result)
    }
  }
}
