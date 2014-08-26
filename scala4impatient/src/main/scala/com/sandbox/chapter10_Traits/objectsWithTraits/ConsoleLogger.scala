package com.sandbox.chapter10_Traits.objectsWithTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}

