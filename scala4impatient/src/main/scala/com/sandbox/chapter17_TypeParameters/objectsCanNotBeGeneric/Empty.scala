package com.sandbox.chapter17_TypeParameters.objectsCanNotBeGeneric

/**
 * Created by jin1 on 2014/9/25.
 */
object Empty extends List[Nothing] {
  // It can't be object Empty[T] extends List[T]
  // OK to be class Empty[T] extends List[T]
  def isEmpty = true
  def head = throw new UnsupportedOperationException
  def tail = throw new UnsupportedOperationException
}
