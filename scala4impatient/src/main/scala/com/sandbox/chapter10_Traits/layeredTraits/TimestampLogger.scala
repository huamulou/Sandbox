package com.sandbox.chapter10_Traits.layeredTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
trait TimestampLogger extends Logged {
  override def log(msg: String) {
    println("TimestampLogger")
    super.log(new java.util.Date() + " " + msg)
  }
}
