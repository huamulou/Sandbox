package com.sandbox.chapter18_AdvancedTypes.dependencyInjection

/**
 * Created by jin1 on 2014/9/29.
 */
object dependencyInjection {
  def main(args: Array[String]) {
    import AppComponents._
    if (auth.login("cay", "secret"))
      logger.log("cay is logged in")
    println("Look inside test.log")
  }
}
