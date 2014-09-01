package com.sandbox.chapter10_Traits.traitsExtendingClasses

/**
 * Created by Jolin&Vash on 2014/9/1.
 */
object traitsExtendingClasses {
  def main (args : Array[String]){
    try {
      val acct = new SavingsAccount
      acct.withdraw(100)
    } catch {
      case e: LoggedException => e.log()
    }
  }
}
