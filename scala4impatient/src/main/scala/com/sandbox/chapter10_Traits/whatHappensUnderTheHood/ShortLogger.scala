package com.sandbox.chapter10_Traits.whatHappensUnderTheHood

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
trait ShortLogger extends Logger {
  val maxLength = 15 // A concrete field
}
