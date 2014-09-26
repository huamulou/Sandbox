package com.sandbox.chapter18_AdvancedTypes.typeProjections

/**
 * Created by Jolin&Vash on 2014/9/26.
 */
object typeProjections {
  def main(args: Array[String]) {
    val chatter = new Network
    val myFace = new Network

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma // OK
    val barney = myFace.join("Barney")
    fred.contacts += barney // Also OK

    //chatter=com.sandbox.chapter18_AdvancedTypes.typeProjections.Network[members=ArrayBuffer(com.sandbox.chapter18_AdvancedTypes.typeProjections.Network$Member[name=Fred,contacts=[Wilma,Barney]], com.sandbox.chapter18_AdvancedTypes.typeProjections.Network$Member[name=Wilma,contacts=[]])]
    println("chatter=" + chatter)

    //myFace=com.sandbox.chapter18_AdvancedTypes.typeProjections.Network[members=ArrayBuffer(com.sandbox.chapter18_AdvancedTypes.typeProjections.Network$Member[name=Barney,contacts=[]])]
    println("myFace=" + myFace)
  }
}
