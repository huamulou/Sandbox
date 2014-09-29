package com.sandbox.chapter18_AdvancedTypes.selfTypes

/**
 * Created by jin1 on 2014/9/29.
 */
trait LoggedException extends Logged {
  this: Exception =>
  def log() { log(getMessage()) }
  // OK to call getMessage because this is an Exception
}
