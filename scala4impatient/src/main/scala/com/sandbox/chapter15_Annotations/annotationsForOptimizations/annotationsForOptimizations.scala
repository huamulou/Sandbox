package com.sandbox.chapter15_Annotations.annotationsForOptimizations

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
object annotationsForOptimizations {
  def main(args: Array[String]) {
    def sum(xs: Seq[Int]): BigInt =
      if (xs.isEmpty) 0 else xs.head + sum(xs.tail)

    def sum2(xs: Seq[Int], partial: BigInt): BigInt =
      if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)

    sum(1 to 1000000) // Will get stack overflow

    sum2(1 to 1000000, 0) // OK

    import scala.annotation._

    // The following will give an error message since the
    // recursive call is not in tail position
//    @tailrec def sum3(xs: Seq[Int]): BigInt =
//      if (xs.isEmpty) 0 else xs.head + sum3(xs.tail)

    // This is OK
    @tailrec def sum4(xs: Seq[Int], partial: BigInt): BigInt =
      if (xs.isEmpty) partial else sum4(xs.tail, xs.head + partial)

    class Util {
      // The following will give an error message since the method
      // can be overridden
//      @tailrec def sum4(xs: Seq[Int], partial: BigInt): BigInt =
//        if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)
    }

    val n = 2

    // This is OK
    (n: @switch) match {
      case 0 => "Zero"
      case 1 => "One"
      case _ => "?"
    }

    // This will give an error indicating that a jump table can't be generated
    (n: @switch) match {
      case v: Int => "" + v
//      case s: String => s
      case _ => "?"
    }
  }
}
