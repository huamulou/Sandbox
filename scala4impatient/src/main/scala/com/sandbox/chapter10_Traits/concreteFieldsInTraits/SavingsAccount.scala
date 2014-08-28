package com.sandbox.chapter10_Traits.concreteFieldsInTraits

/*

$ javap -private Account.class
Compiled from "Logger.scala"
public class Account implements scala.ScalaObject {
  private double balance;
  ...
}

$ javap -private SavingsAccount.class
Compiled from "Logger.scala"
public class SavingsAccount extends Account implements ShortLogger,scala.ScalaObject {
  private double interest;
  private final int maxLength;
  ...
}

*/
class SavingsAccount extends Account with ConsoleLogger with ShortLogger {
  var interest = 0.0
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}
