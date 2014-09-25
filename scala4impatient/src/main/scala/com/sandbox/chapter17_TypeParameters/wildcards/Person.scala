package com.sandbox.chapter17_TypeParameters.wildcards

/**
 * Created by jin1 on 2014/9/25.
 */
class Person(val name: String) {
  override def toString = getClass.getName + " " + name
}