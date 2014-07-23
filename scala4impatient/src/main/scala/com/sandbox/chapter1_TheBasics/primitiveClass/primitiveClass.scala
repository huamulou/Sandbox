package com.sandbox.chapter1_TheBasics.primitiveClass

/**
 * Created by Jolin&Vash on 2014/7/19.
 */
object primitiveClass {
  def main(args: Array[String]) {
    val num : String = 1.toString()
    val nums : Range = 1.to(10)
    val hello : String = "Hello".intersect("World")
    val integer : Int = 99.44.toInt
    val char : Char = integer.toChar
    val double : Double = "99.44".toDouble
    println(num)      //1
    println(nums)     //Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(hello)    //lo
    println(integer)  //99
    println(char)     //c
    println(double)   //99.44
  }

}
