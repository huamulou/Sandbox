package com.sandbox.chapter10_Traits.initializingTraitFields

import java.io.PrintWriter

/**
 * Created by Jolin&Vash on 2014/8/31.
 */
// This version constructs the writer lazily
trait FileLogger2 extends Logger {
  val filename: String
  lazy val out = new PrintWriter(filename)
  def log(msg: String) { out.println(msg); out.flush() }
}
