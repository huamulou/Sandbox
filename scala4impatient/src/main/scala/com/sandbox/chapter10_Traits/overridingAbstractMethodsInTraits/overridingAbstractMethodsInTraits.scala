package com.sandbox.chapter10_Traits.overridingAbstractMethodsInTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
object overridingAbstractMethodsInTraits {
  def main(args: Array[String]) {
    val acct1 = new SavingsAccount with ConsoleLogger with
      TimestampLogger
    /**
     *   the class of acct1 is a anonymous inner class which extends SavingsAccount, coz the abstract method log is implemented by
     * TimestampLogger and ConsoleLogger
     * */
    println(acct1.getClass.getName) // com.sandbox.chapter10_Traits.overridingAbstractMethodsInTraits.overridingAbstractMethodsInTraits$$anon$1
    acct1.withdraw(100)
  }
}
