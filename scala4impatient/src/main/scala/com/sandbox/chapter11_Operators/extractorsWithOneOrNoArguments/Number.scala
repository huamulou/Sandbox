package com.sandbox.chapter11_Operators.extractorsWithOneOrNoArguments

/**
 * Created by jin1 on 2014/9/3.
 */
object Number {
  def unapply(input: String): Option[Int] =
    try {
      Some(Integer.parseInt(input.trim))
    } catch {
      case ex: NumberFormatException => None
    }
}
