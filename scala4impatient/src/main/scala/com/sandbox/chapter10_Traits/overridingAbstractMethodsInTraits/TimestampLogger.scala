package com.sandbox.chapter10_Traits.overridingAbstractMethodsInTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
trait TimestampLogger extends Logger {
  abstract override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}
