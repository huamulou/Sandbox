package com.sandbox.chapter17_TypeParameters.objectsCanNotBeGeneric

/**
 * Created by jin1 on 2014/9/25.
 */
class Node[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}
