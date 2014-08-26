package com.sandbox.chapter10_Traits.layeredTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
object layeredTraits {
  def main(args : Array[String]){
    val acct1 = new SavingsAccount with ConsoleLogger with
      TimestampLogger with ShortLogger
    val acct2 = new SavingsAccount with ConsoleLogger with
      ShortLogger with TimestampLogger
    acct1.withdraw(100)
    println("=================================acct1==========================================")
    acct2.withdraw(100)
    println("=================================acct2==========================================")

    val acct3 = new AnotherSavingsAccount with ConsoleLogger with
      TimestampLogger with ShortLogger
    val acct4 = new AnotherSavingsAccount with ConsoleLogger with
      ShortLogger with TimestampLogger
    acct3.withdraw(100)
    println("=================================acct3==========================================")
    acct4.withdraw(100)
    println("=================================acct4==========================================")

    val acct5 = new SavingsAccount with ConsoleLogger with
      AnotherTimestampLogger with AnotherShortLogger
    val acct6 = new SavingsAccount with ConsoleLogger with
      AnotherShortLogger with AnotherTimestampLogger
    acct5.withdraw(100)
    println("=================================acct5==========================================")
    acct6.withdraw(100)
    println("=================================acct6==========================================")
  }
}
