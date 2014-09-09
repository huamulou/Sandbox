package com.sandbox.chapter13_Collections.lists

/**
 * Created by jin1 on 2014/9/9.
 */
object Lists {

  def sum1(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => h + sum1(t) // h is lst.head, t is lst.tail
  }

  def sum2(lst: List[Int]): Int =
    if (lst == Nil) 0 else lst.head + sum2(lst.tail)

  def main(args: Array[String]) {
    val digits = List(4, 2)

    9 :: List(4, 2)

    9 :: 4 :: 2 :: Nil

    9 :: (4 :: (2 :: Nil))



    println(sum1(List(9, 4, 2)))

    println(sum2(List(9, 4, 2)))

    List(9, 4, 2).sum
  }
}
