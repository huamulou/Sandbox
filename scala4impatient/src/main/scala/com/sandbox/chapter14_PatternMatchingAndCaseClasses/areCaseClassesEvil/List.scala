package com.sandbox.chapter14_PatternMatchingAndCaseClasses.areCaseClassesEvil

/**
 * Created by jin1 on 2014/9/17.
 */
abstract class List {
  def ::(a: Any) = new ::(a, this)
}

case object Nil extends List
case class ::(head: Any, tail: List) extends List
