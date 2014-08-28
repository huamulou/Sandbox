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
class Account {
  protected var balance = 0.0
}
