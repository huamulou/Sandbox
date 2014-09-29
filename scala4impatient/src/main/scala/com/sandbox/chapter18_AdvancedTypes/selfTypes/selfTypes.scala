package com.sandbox.chapter18_AdvancedTypes.selfTypes

/**
 * Created by jin1 on 2014/9/29.
 */
import javax.swing._

object selfTypes {
  def main(args : Array[String]){
    // Error: JFrame isn’t a subtype of Exception, the self type of LoggedException
    // val f = new JFrame with LoggedException
  }
}
