package com.sandbox.chapter10_Traits.initializingTraitFields

/**
 * Created by Jolin&Vash on 2014/8/31.
 */
object initializingTraitFields {
  def main (args : Array[String]){
    val acct = new {
      val filename = "myapp.log"
    } with SavingsAccount with FileLogger
    acct.withdraw(100)

    val acct2 = new SavingsAccount with FileLogger2 {
      val filename = "myapp2.log"
    }
    acct2.withdraw(100)
    println("Look into myapp.log and myapp2.log for the log messages.");
  }
}
