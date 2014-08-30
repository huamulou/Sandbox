package com.sandbox.chapter10_Traits.traitConstructionOrder

/**
 * Created by Jolin&Vash on 2014/8/30.
 */
trait ShortLogger extends Logger {
  println("Constructing ShortLogger")

  val maxLength: Int // An abstract field
  abstract override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}
