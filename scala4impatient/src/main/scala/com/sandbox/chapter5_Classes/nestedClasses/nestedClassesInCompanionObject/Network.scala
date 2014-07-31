package com.sandbox.chapter5_Classes.nestedClasses.nestedClassesInCompanionObject

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
class Network {
  private val members = new ArrayBuffer[Network.Member]

  def join(name: String) = {
    val m = new Network.Member(name)
    members += m
    m
  }
  def description = "a network with members " +
    (for (m <- members) yield m.description).mkString(", ")
}

object Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
    def description = name + " with contacts " +
      (for (c <- contacts) yield c.name).mkString(" ")
  }
}
