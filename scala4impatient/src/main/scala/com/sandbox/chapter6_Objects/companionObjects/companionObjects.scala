package com.sandbox.chapter6_Objects.companionObjects

/**
 * Created by Jolin&Vash on 2014/8/3.
 */
object companionObjects {
  def main(args: Array[String]) {
    val acct1 = new Account
    val acct2 = new Account
    acct1.deposit(1000)
    val d1 = acct1.description
    println(d1)    // Account 1 with balance 1000.0
    val d2 = acct2.description
    println(d2)    // Account 2 with balance 0.0
  }
}
