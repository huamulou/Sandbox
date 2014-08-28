package com.sandbox.chapter10_Traits.concreteFieldsInTraits

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
trait ShortLogger extends Logged {
  val maxLength = 15
  override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}
