package com.sandbox.chapter18_AdvancedTypes.dependencyInjection

/**
 * Created by jin1 on 2014/9/29.
 */
import java.io._

trait AuthComponent {
  this: LoggerComponent => // Gives access to logger

  trait Auth {
    def login(id: String, password: String) = {
      if (check(id, password)) true
      else {
        logger.log("login failure for " + id)
        false
      }
    }
    def check(id: String, password: String): Boolean
  }

  val auth: Auth

  class MockAuth(file: String) extends Auth {
    val props = new java.util.Properties()
    props.load(new FileReader(file))
    def check(id: String, password: String) = props.getProperty(id) == password
  }
}
