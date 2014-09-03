package com.sandbox.chapter11_Operators.theUnapplySeqMethod

/**
 * Created by jin1 on 2014/9/3.
 */
object theUnapplySeqMethod {
  def main(args : Array[String]){
    val author = "Peter van der Linden"

    author match {
      case Name(first, last) => {println(first);println(last)}
      case Name(first, middle, last) => {println(first);println(middle);println(last)}
      case Name(first, "van", "der", last) => println("Hello Peter!")
    }
  }
}
