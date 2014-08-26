package com.sandbox.chapter10_Traits.layeredTraits

/**
 * Created by Jolin&Vash on 2014/8/26.
 */
class AnotherSavingsAccount extends Account with Logged{
  def withdraw(amount: Double) {
    if (amount > balance) super[Logged].log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
