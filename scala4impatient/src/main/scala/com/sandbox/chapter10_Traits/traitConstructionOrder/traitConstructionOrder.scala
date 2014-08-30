package com.sandbox.chapter10_Traits.traitConstructionOrder

/**
 * Created by Jolin&Vash on 2014/8/30.
 */
object traitConstructionOrder {
  def main (args : Array[String]){
    val acct = new SavingsAccount
    acct.withdraw(100)
    println("Look into myapp.log for the log message.");
  }
}
