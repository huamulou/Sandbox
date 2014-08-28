package com.sandbox.chapter10_Traits.abstractFieldsInTraits

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
object abstractFieldsInTraits {
  def main(args: Array[String]){
    val acct = new SavingsAccount with ConsoleLogger with ShortLogger {
      val maxLength = 20
    }
    acct.withdraw(100)
    // Log message is not truncated because maxLength is 20
  }
}
