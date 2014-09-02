package com.sandbox.chapter10_Traits.selfTypes

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
trait LoggedException extends Logged {
  this: Exception => // or this: { def getMessage() : String } =>
  def log() { log(getMessage()) }
}
