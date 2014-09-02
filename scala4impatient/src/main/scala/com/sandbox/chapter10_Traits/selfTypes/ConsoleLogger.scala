package com.sandbox.chapter10_Traits.selfTypes

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}
