package com.sandbox.chapter6_Objects.applicationObjects

/**
 * Created by jin1 on 2014/8/5.
 */
object Hello extends App {
  if (args.length > 0)
    println("Hello, " + args(0))
  else
    println("Hello, World!")
}
