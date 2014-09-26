package com.sandbox.chapter18_AdvancedTypes.typeProjections

import scala.collection.mutable.ArrayBuffer

/**
 * Created by jin1 on 2014/9/26.
 */
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network#Member]
    override def toString = getClass.getName + "[name=" + name +
      ",contacts=" + contacts.map(_.name).mkString("[", ",", "]") + "]"
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }

  override def toString = getClass.getName + "[members=" + members + "]"
}
