package com.sandbox.chapter10_Traits.whatHappensUnderTheHood

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
trait ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}
