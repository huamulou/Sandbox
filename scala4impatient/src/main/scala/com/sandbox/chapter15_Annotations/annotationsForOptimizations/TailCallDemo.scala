package com.sandbox.chapter15_Annotations.annotationsForOptimizations

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
import scala.util.control.TailCalls._

object TailCallDemo extends App {
  def evenLength(xs: Seq[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(true) else tailcall(oddLength(xs.tail))

  def oddLength(xs: Seq[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(false) else tailcall(evenLength(xs.tail))

  println(evenLength(1 to 1000000).result)
}
