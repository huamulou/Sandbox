package com.sandbox.chapter11_Operators.extractors

/**
 * Created by jin1 on 2014/9/3.
 */
object Name {
  def unapply(input: String) = {
    val pos = input.indexOf(" ")
    if (pos == -1) None
    else Some((input.substring(0, pos), input.substring(pos + 1)))
  }
}