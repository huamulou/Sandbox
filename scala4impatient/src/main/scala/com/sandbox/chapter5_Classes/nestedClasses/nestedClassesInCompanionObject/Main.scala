package com.sandbox.chapter5_Classes.nestedClasses.nestedClassesInCompanionObject

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
  println("chatter is " + chatter.description)  // chatter is a network with members Fred with contacts Wilma Barney, Wilma with contacts
  println("myFace is " + myFace.description)  // myFace is a network with members Barney with contacts
}
