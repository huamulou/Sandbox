package com.sandbox.chapter10_Traits.objectsWithTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
object objectsWithTraits {
  def main(args: Array[String]) {
    val acct1 = new SavingsAccount
    acct1.withdraw(100) // No log message is printed

    println("Overdrawing acct2");
    val acct2 = new SavingsAccount with ConsoleLogger
    acct2.withdraw(100)  // Insufficient funds
  }
}
