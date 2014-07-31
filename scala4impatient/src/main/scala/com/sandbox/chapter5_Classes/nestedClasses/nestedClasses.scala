package com.sandbox.chapter5_Classes.nestedClasses

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
object nestedClasses {
  def main(args: Array[String]) {
    val chatter = new Network
    val myFace = new Network

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma // OK
    val barney = myFace.join("Barney") // Has type myFace.Member

    // Can’t add a myFace.Member to a buffer of chatter.Member elements
    // fred.contacts += barney // No

  }
}
