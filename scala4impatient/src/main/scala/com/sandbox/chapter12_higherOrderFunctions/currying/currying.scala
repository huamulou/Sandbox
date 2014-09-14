package com.sandbox.chapter12_HigherOrderFunctions.currying

/**
 * Created by jin1 on 2014/9/5.
 */
object currying {
  def main(args : Array[String]){
    def mul(x: Int, y: Int) = x * y

    // function after currying
    // equals to def mulOneAtATime(x: Int)(y: Int) = x * y
    def mulOneAtATime(x: Int) = (y: Int) => x * y
    val v1 = mulOneAtATime(6)(7)
    println(v1)

    val a = Array("Hello", "World")
    val b = Array("hello", "world")
    // "_.equalsIgnoreCase(_)" is as a abbreviation of "(a:String,b:String)=>a.equalsIgnoreCase(b)"
    val v2 = a.corresponds(b)(_.equalsIgnoreCase(_))
    println(v2)
  }
}
