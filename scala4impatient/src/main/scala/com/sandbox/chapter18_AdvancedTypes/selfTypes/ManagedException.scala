package com.sandbox.chapter18_AdvancedTypes.selfTypes

/**
 * Created by jin1 on 2014/9/29.
 */

//trait ManagedException extends LoggedException { // Error
//// Self type doesn't inherit
//def print() { println(getMessage()) }
//}

trait ManagedException extends LoggedException {
  this: Exception => // Must repeat self type
  def print() { println(getMessage()) }
}