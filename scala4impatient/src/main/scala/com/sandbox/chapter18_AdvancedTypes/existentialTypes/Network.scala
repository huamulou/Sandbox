package com.sandbox.chapter18_AdvancedTypes.existentialTypes

/**
 * Created by jin1 on 2014/9/29.
 */
import scala.collection.mutable. ArrayBuffer

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
