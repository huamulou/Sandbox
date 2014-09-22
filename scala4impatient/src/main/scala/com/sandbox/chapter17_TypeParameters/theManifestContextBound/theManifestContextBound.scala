package com.sandbox.chapter17_TypeParameters.theManifestContextBound

/**
 * Created by Jolin&Vash on 2014/9/23.
 */
object theManifestContextBound {
  def makePair[T : Manifest](first: T, second: T) = {
    val r = new Array[T](2); r(0) = first; r(1) = second; r
  }

  def main(args: Array[String]) {
    val a = makePair(4, 2) // An Array[Int]
    // In the JVM, [I is an int[] array
    println(a.getClass)  // class [I

    val b = makePair("Fred", "Brooks") // An Array[String]
    // In the JVM, [Ljava.lang.String; is a String[] array
    println(b.getClass)  // class [Ljava.lang.String;
  }
}
