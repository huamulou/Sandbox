package com.sandbox.chapter5_Classes.nestedClasses.nestedClassesByTypeProjection

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
object Main extends App{
  val chatter = new Network
  val myFace = new Network

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // OK
  val barney = myFace.join("Barney")
  fred.contacts += barney // Also OK
}
