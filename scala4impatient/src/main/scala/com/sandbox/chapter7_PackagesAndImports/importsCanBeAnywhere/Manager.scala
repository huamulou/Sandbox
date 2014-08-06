package com.sandbox.chapter7_PackagesAndImports.importsCanBeAnywhere

/**
 * Created by jin1 on 2014/8/6.
 */
class Manager {
  import collection.mutable._
  val subordinates = new ArrayBuffer[Employee]
  def description = "A manager with " + subordinates.length + " subordinates"
}
