package com.sandbox.chapter11_Operators.identifiers

/**
 * Created by jin1 on 2014/9/3.
 */
object identifiers {
  def main(args : Array[String]){
    val √ = scala.math.sqrt _

    √(2)

    val `val` = 42

    println(`val`)
  }
}
