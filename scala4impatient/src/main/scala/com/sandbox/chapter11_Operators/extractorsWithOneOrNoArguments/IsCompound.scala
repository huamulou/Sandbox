package com.sandbox.chapter11_Operators.extractorsWithOneOrNoArguments

/**
 * Created by jin1 on 2014/9/3.
 */
object IsCompound {
  def unapply(input: String) = input.contains(" ")
}
