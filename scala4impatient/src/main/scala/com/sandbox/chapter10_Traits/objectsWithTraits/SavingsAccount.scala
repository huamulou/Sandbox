package com.sandbox.chapter10_Traits.objectsWithTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
class SavingsAccount extends Account with Logged {
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
