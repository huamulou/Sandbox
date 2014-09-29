package com.sandbox.chapter18_AdvancedTypes.dependencyInjection

/**
 * Created by jin1 on 2014/9/29.
 */
object AppComponents extends LoggerComponent with AuthComponent {
  val logger = new FileLogger("src/main/resources/test.log")
  val auth = new MockAuth("src/main/resources/users.txt")
}
