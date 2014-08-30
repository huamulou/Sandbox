package com.sandbox.chapter10_Traits.traitConstructionOrder

/**
 * Created by Jolin&Vash on 2014/8/30.
 */
trait Logger {
  println("Constructing Logger")

  def log(msg: String)
}