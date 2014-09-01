package com.sandbox.chapter10_Traits.traitsExtendingClasses

/**
 * Created by Jolin&Vash on 2014/9/1.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}
