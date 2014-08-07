package com.sandbox.chapter8_Inheritance.overridingFields

/**
 * Created by jin1 on 2014/8/7.
 */
class AnotherSecretAgent extends AbstractPerson{
  override val id = scala.util.Random.nextInt
}
