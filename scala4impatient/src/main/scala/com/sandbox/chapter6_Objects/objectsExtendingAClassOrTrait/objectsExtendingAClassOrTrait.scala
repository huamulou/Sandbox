package com.sandbox.chapter6_Objects.objectsExtendingAClassOrTrait

/**
 * Created by Jolin&Vash on 2014/8/4.
 */
object objectsExtendingAClassOrTrait extends App{
  val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
  println(actions("open").description)  // Do nothing
  println(actions("open") == actions("save"))  // true
}
