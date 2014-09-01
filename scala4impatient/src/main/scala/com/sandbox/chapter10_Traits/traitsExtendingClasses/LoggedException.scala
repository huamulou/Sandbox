package com.sandbox.chapter10_Traits.traitsExtendingClasses

/**
 * Created by Jolin&Vash on 2014/9/1.
 */
trait LoggedException extends Exception with Logged {
  def log() { log(getMessage()) }
}
