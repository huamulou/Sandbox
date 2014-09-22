package com.sandbox.chapter17_TypeParameters.genericFunctions

/**
 * Created by jin1 on 2014/9/22.
 */
object genericFunctions {
  def main(args: Array[String]) {
    def getMiddle[T](a: Array[T]) = a(a.length / 2)

    getMiddle(Array("Mary", "had", "a", "little", "lamb"))

    // specified the type of generic function and save it to f, and the _ is the argument of function getMiddle[String].
    val f = getMiddle[String] _
    f(Array("Mary", "had", "a", "little", "lamb"))
  }
}
