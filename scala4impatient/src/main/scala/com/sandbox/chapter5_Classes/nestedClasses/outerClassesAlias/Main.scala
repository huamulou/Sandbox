package com.sandbox.chapter5_Classes.nestedClasses.outerClassesAlias

/**
 * Created by Jolin&Vash on 2014/8/1.
 */
object Main extends App {
  val chatter = new Network("Chatter")
  val myFace = new Network("MyFace")

  val fred = chatter.join("Fred")
  println(fred.description);   // Fred inside Chatter
  val barney = myFace.join("Barney")
  println(barney.description);   // Barney inside MyFace
}
