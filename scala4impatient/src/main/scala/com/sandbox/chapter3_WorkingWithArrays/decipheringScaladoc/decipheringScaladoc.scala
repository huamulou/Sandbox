package com.sandbox.chapter3_WorkingWithArrays.decipheringScaladoc

/**
 * Created by Jolin&Vash on 2014/7/27.
 */
object decipheringScaladoc {
  def main(args: Array[String]) {
    import scala.collection.mutable.ArrayBuffer

    val a = Array(1, -2, 3, -4, 5)
    val b = ArrayBuffer(1, 7, 2, 9)

    println(a.count(_ > 0))  // 3

    b.append(1, 7, 2, 9)
    println(b.mkString(","))  // 1,7,2,9,1,7,2,9

    b.appendAll(a)
    println(b.mkString(","))  // 1,7,2,9,1,7,2,9,1,-2,3,-4,5

    b += 4 -= 7
    println(b.mkString(","))  // 1,2,9,1,7,2,9,1,-2,3,-4,5,4

    // before copy
    println("before copy")
    println(a.mkString(","))  // 1,-2,3,-4,5
    println(b.mkString(","))  // 1,2,9,1,7,2,9,1,-2,3,-4,5,4
    // default copy start from index 0 and the copied length is the a.length and the elements in a will be covered by b's
    b.copyToArray(a)
    //after copy
    println("after copy")
    println(a.mkString(","))  // 1,2,9,1,7

    val xs = Array(1, "Fred", 2, 9)
    b.copyToArray(xs)
    println(xs.mkString(","))  // 1,2,9,1

    val maxValue = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
    println(maxValue)  // little

    import java.util._

    val maxDate = ArrayBuffer(new GregorianCalendar(2012, 0, 1),
      new GregorianCalendar(1999, 11, 31)).max[Calendar]
    /**
     * the max method definition:
     *    def max[B >: A](implicit cmp: Ordering[B]): A
     * and it accepts the element which is about to be compared has the trait of Ordered or those class implemented Comparable interface
     * */
    // Calendar implements Comparable[Calendar]
    println(maxDate.getTime.toString)  // Sun Jan 01 00:00:00 CST 2012

    val paddedB = b.padTo(20, -1)
    println(paddedB.mkString(","))  // 1,2,9,1,7,2,9,1,-2,3,-4,5,4,-1,-1,-1,-1,-1,-1,-1

    val padToRV = (1 to 10).padTo(20, -1) // Note that the result is a Vector, not a Range
    println(padToRV.mkString(","))  // 1,2,3,4,5,6,7,8,9,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
  }
}
