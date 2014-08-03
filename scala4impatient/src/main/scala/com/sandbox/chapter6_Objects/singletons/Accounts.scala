package com.sandbox.chapter6_Objects.singletons

/**
 * Created by Jolin&Vash on 2014/8/3.
 */
object Accounts {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

