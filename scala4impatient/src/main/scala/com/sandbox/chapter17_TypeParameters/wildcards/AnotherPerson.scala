package com.sandbox.chapter17_TypeParameters.wildcards

/**
 * Created by jin1 on 2014/9/25.
 */
class AnotherPerson(val name: String) extends Comparable[Person] {
  override def toString = getClass.getName + " " + name
  def compareTo(other: Person) = name.compareTo(other.name)
}
