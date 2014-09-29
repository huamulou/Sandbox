package com.sandbox.chapter18_AdvancedTypes.existentialTypes

/**
 * Created by jin1 on 2014/9/29.
 */
object existentialTypes {
  def main(args: Array[String]) {
    def process[M <: n.Member forSome { val n: Network }](m1: M, m2: M) = (m1, m2)

    val chatter = new Network
    val myFace = new Network
    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    val barney = myFace.join("Barney")
    process(fred, wilma) // Ok
    // Error
    // process(fred, barney)
  }
}
