package com.sandbox.chapter21_Implicits.evidence

/**
 * Created by Jolin&Vash on 2014/10/5.
 */
object evidence {
  def main(args: Array[String]) {
    def firstLast[A, C](it: C)(implicit ev: C <:< Iterable[A]) =
      (it.head, it.last)

    val rv1 = firstLast(List(1, 7, 2, 9))
    println(rv1)

    //Error:(14, 24) Cannot prove that String <:< Iterable[A].val rv2 = firstLast("Fred")
//    val rv2 = firstLast("Fred")
//    println(rv2)

    //Error:(18, 26) Cannot prove that String <:< Iterable[_].val rv3 =  implicitly[String <:< Iterable[_]]
//    val rv3 =  implicitly[String <:< Iterable[_]]
//    println(rv3)

    val rv4 = implicitly[String <:< AnyRef]
    println(rv4("hello").getClass.getName)

    //Error:(25, 25) Cannot prove that AnyRef <:< String.val rv5 = implicitly[AnyRef <:< String]
//    val rv5 = implicitly[AnyRef <:< String]
//    println(rv5)
  }
}
