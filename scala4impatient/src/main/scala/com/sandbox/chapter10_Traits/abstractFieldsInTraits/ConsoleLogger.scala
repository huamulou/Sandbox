package com.sandbox.chapter10_Traits.abstractFieldsInTraits

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}
