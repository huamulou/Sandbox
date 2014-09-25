package com.sandbox.chapter17_TypeParameters.objectsCanNotBeGeneric

/**
 * Created by jin1 on 2014/9/25.
 */
abstract class List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
