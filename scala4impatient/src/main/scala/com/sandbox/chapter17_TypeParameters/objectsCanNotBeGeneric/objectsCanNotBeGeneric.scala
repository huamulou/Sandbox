package com.sandbox.chapter17_TypeParameters.objectsCanNotBeGeneric

/**
 * Created by jin1 on 2014/9/25.
 */
object objectsCanNotBeGeneric {
  def show[T](lst: List[T]) {
    if (!lst.isEmpty) { println(lst.head); show(lst.tail) }
  }

  def main(args: Array[String]) {
    val lst = new Node(42, Empty)
    show(new Node(1729, lst))
  }
}
