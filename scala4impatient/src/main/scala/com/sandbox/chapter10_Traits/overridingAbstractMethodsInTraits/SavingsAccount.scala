package com.sandbox.chapter10_Traits.overridingAbstractMethodsInTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
abstract class SavingsAccount extends Account with Logger {
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
