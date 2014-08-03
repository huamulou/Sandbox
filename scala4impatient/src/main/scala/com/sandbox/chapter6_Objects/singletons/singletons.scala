package com.sandbox.chapter6_Objects.singletons

/**
 * Created by Jolin&Vash on 2014/8/3.
 */
object singletons {
  def main(args: Array[String]) {
    val newUniqueNumber1 = Accounts.newUniqueNumber()
    val newUniqueNumber2 =  Accounts.newUniqueNumber()

    println(newUniqueNumber1)  // 1
    println(newUniqueNumber2)  // 2
  }
}
