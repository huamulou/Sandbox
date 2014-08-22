package com.sandbox.chapter10_Traits.traitsWithConcreteImplementations

/**
 * Created by jin1 on 2014/8/22.
 */
object traitsWithConcreteImplementations {
  def main(args: Array[String]) {
    val acct = new SavingsAccount
    acct.withdraw(100)
  }
}
