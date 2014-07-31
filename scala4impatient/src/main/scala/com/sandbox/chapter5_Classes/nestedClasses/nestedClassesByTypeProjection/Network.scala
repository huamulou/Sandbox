package com.sandbox.chapter5_Classes.nestedClasses.nestedClassesByTypeProjection

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
