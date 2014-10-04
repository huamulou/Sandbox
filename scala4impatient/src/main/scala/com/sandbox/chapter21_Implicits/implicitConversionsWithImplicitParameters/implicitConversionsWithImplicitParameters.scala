package com.sandbox.chapter21_Implicits.implicitConversionsWithImplicitParameters

/**
 * Created by Jolin&Vash on 2014/10/5.
 */
object implicitConversionsWithImplicitParameters {
  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) =
    if (order(a) < b) a else b // Can omit call to order

  def main(args: Array[String]) {
    val rv1= smaller(40, 2)
    println(rv1)  // 2

    val rv2 = smaller("Hello", "World")
    println(rv2)  // Hello
  }
}
