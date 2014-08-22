package com.sandbox.chapter10_Traits.traitsAsInterfaces

import java.io.Serializable
/**
 * Created by jin1 on 2014/8/22.
 */
class ConsoleLogger extends Logger // Use extends, not implements
  with Cloneable with Serializable { // Use with to add multiple traits
  def log(msg: String) { println(msg) } // No override needed
}
