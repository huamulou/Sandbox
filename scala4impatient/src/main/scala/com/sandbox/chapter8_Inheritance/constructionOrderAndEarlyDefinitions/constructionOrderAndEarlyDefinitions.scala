package com.sandbox.chapter8_Inheritance.constructionOrderAndEarlyDefinitions

/**
 * Created by jin1 on 2014/8/8.
 */
object constructionOrderAndEarlyDefinitions {
  def main(args: Array[String]) {
    val a = new Ant
    println(a.range)      // 2
    println(a.env.length) // 0

    val b = new Bug
    println(b.range)      // 3
    println(b.env.length) // 3
  }
}
