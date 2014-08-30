package com.sandbox.chapter10_Traits.traitConstructionOrder

/**
 * Created by Jolin&Vash on 2014/8/30.
 */
class SavingsAccount extends Account with FileLogger with ShortLogger {
  println("Constructing SavingsAccount")

  val maxLength = 15
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
