package com.sandbox.chapter6_Objects.companionObjects

/**
 * Created by Jolin&Vash on 2014/8/3.
 */
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account { // The companion object
private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}
