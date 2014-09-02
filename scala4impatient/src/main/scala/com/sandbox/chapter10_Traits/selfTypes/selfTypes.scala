package com.sandbox.chapter10_Traits.selfTypes

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
object selfTypes {
  def main(args : Array[String]){
    try {
      val acct = new SavingsAccount
      acct.withdraw(100)
    } catch {
      case e: LoggedException => e.log()
    }
  }
}
