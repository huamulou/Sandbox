package com.sandbox.chapter10_Traits.layeredTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
trait AnotherTimestampLogger extends Logged {
  override def log(msg: String) {
    println("AnotherTimestampLogger")
//    super.log(new java.util.Date() + " " + msg)
  }
}
