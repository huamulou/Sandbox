package com.sandbox.chapter10_Traits.traitsForRichInterfaces

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
class SavingsAccount extends Account with Logger {
  def withdraw(amount: Double) {
    if (amount > balance) severe("Insufficient funds")
    else balance -= amount
  }

  // More methods ...

  override def log(msg: String) { println(msg) }
}
