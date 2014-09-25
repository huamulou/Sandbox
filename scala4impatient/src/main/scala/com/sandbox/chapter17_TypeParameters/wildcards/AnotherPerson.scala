package com.sandbox.chapter17_TypeParameters.wildcards

/**
 * Created by jin1 on 2014/9/25.
 */
class AnotherPerson(val name: String) extends Comparable[AnotherPerson] {
  override def toString = getClass.getName + " " + name
  def compareTo(other: AnotherPerson) = name.compareTo(other.name)
}
