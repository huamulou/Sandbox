package com.sandbox.chapter10_Traits.traitsForRichInterfaces

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
trait Logger {
  def log(msg: String)
  def info(msg: String) { log("INFO: " + msg) }
  def warn(msg: String) { log("WARN: " + msg) }
  def severe(msg: String) { log("SEVERE: " + msg) }
}
