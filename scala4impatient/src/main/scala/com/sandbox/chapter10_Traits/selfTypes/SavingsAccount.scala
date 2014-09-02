package com.sandbox.chapter10_Traits.selfTypes

/**
 * Created by Jolin&Vash on 2014/9/2.
 */
class SavingsAccount extends Account {
  def withdraw(amount: Double) {
    if (amount > balance) throw
      new IllegalStateException("Insufficient funds")
        with LoggedException with ConsoleLogger
    else balance -= amount
  }

  // More methods ...
}
