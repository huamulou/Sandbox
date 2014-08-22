package com.sandbox.chapter10_Traits.traitsWithConcreteImplementations

/**
 * Created by jin1 on 2014/8/22.
 */
class SavingsAccount extends Account with ConsoleLogger {
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
