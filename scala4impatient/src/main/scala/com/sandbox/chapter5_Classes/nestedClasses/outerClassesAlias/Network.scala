package com.sandbox.chapter5_Classes.nestedClasses.outerClassesAlias

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
class Network(val name: String) { outer =>
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
    def description = name + " inside " + outer.name
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
