package com.sandbox.chapter8_Inheritance.overridingFields

/**
 * Created by jin1 on 2014/8/7.
 */
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret" // Don’t want to reveal name . . .
  override val toString = "secret" // . . . or class name
}
