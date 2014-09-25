package com.sandbox.chapter17_TypeParameters.wildcards

/**
 * Created by jin1 on 2014/9/25.
 */
class Pair[T](var first: T, var second: T) {
  override def toString = "(" + first + "," + second + ")"
}
