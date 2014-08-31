package com.sandbox.chapter10_Traits.initializingTraitFields

import java.io.PrintWriter

/**
 * Created by Jolin&Vash on 2014/8/31.
 */
// Use early definition syntax to define filename
trait FileLogger extends Logger {
  val filename: String
  val out = new PrintWriter(filename)
  def log(msg: String) { out.println(msg); out.flush() }
}
