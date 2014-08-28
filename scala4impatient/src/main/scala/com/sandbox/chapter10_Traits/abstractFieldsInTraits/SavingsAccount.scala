package com.sandbox.chapter10_Traits.abstractFieldsInTraits

/**
 * Created by Jolin&Vash on 2014/8/28.
 */
class SavingsAccount extends Account with Logged {
  var interest = 0.0
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
