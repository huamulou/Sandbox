package com.sandbox.chapter7_PackagesAndImports.implicitImports

/**
 * Created by jin1 on 2014/8/6.
 */
object implicitImports {
  def main(args: Array[String]) {
    new String("Fred") // from the java.lang package
    new StringBuilder // from the scala package, not java.lang
    new java.lang.StringBuilder

    println("Hello") // from the Predef object

    new collection.mutable.HashMap[String, Int]
    new scala.collection.mutable.HashMap[String, Int]
  }
}
