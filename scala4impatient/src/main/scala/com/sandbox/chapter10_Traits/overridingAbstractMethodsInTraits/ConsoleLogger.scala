package com.sandbox.chapter10_Traits.overridingAbstractMethodsInTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
trait ConsoleLogger extends Logger {
  override def log(msg: String) { println(msg) }
}
