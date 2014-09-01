package com.sandbox.chapter10_Traits.traitsExtendingClasses

/**
 * Created by Jolin&Vash on 2014/9/1.
 */
class SavingsAccount extends Account {
  def withdraw(amount: Double) {
    if (amount > balance) throw new UnhappyException with ConsoleLogger
    else balance -= amount
  }

  // More methods ...
}
