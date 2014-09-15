package com.sandbox.chapter13_Collections.lazyViews

/**
 * Created by jin1 on 2014/9/15.
 */
object lazyViews {
  def main(args: Array[String]) {
    import scala.math._

    val powers1 = (0 until 1000).view.map(pow(10, _))

    println("power1 " + powers1(100))  // power1 1.0E100

    val powers2 = (0 until 1000).view.map(n => { println(n) ; pow(10, n) })

    // Prints 100 in the method call
    println("power2 " + powers2(100))  // power2 1.0E100

    // Prints 100 again; the method is called twice
    println("power2 " + powers2(100))   // power2 1.0E100

    // Contrast with streams

    def powers3(n: Int): Stream[Double] = { println(n) ; pow(10, n) } #:: powers3(n + 1)

    val powerStream = powers3(0) // Calls method with 0
    powerStream(100) // Calls method with 1 to 100
    powerStream(100) // Doesn't call the method again

    (0 to 1000).map(pow(10, _)).map(1 / _)

    val list2 = (0 to 1000).view.map(pow(10, _)).map(1 / _).force
    println("list2 " + list2.mkString(","))  // list2 1.0,0.1,0.01,0.001,1.0E-4,1.0E-5,1.0E-6,1.0E-7,1.0E-8,...............

    (0 to 1000).map(x => pow(10, -x))
  }
}
