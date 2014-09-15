package com.sandbox.chapter13_Collections.lazyViews

/**
 * Created by jin1 on 2014/9/15.
 */
object lazyViews {
  def main(args: Array[String]) {
    import scala.math._

    val powers1 = (0 until 1000).view.map(pow(10, _))

    powers1(100)

    val powers2 = (0 until 1000).view.map(n => { println(n) ; pow(10, n) })

    powers2(100) // Prints 100 in the method call
    powers2(100) // Prints 100 again; the method is called twice

    // Contrast with streams

    def powers3(n: Int): Stream[Double] = { println(n) ; pow(10, n) } #:: powers3(n + 1)

    val powerStream = powers3(0) // Calls method with 0
    powerStream(100) // Calls method with 1 to 100
    powerStream(100) // Doesn't call the method again

    (0 to 1000).map(pow(10, _)).map(1 / _)

    (0 to 1000).view.map(pow(10, _)).map(1 / _).force

    (0 to 1000).map(x => pow(10, -x))
  }
}
