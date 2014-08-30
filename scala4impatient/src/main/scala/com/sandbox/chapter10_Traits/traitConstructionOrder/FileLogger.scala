package com.sandbox.chapter10_Traits.traitConstructionOrder

import java.io.PrintWriter
import java.util.Date

/**
 * Created by Jolin&Vash on 2014/8/30.
 */
trait FileLogger extends Logger {
  println("Constructing FileLogger")

  val out = new PrintWriter("app.log") // Part of the trait’s constructor
  out.println("# " + new Date().toString) // Also part of the constructor
  out.flush();
  def log(msg: String) { out.println(msg); out.flush() }
}
