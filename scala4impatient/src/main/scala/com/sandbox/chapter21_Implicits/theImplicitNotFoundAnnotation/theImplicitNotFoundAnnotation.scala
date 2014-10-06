package com.sandbox.chapter21_Implicits.theImplicitNotFoundAnnotation

/**
 * Created by Jolin&Vash on 2014/10/5.
 */
object theImplicitNotFoundAnnotation {
  def main(args: Array[String]) {
    import scala.annotation._

    @implicitNotFound(msg = "I am baffled why you give me ${From} when I want ${To}.")
    abstract class <:<[-From, +To] extends Function1[From, To]

    object <:< {
      implicit def conforms[A] = new (A <:< A) { def apply(x: A) = x }
    }

    def firstLast[A, C](it: C)(implicit ev: C <:< Iterable[A]) =
      (it.head, it.last)

    //Error:(20, 14) I am baffled why you give me String when I want Iterable[A].firstLast("Fred")
//    firstLast("Fred")
  }
}
