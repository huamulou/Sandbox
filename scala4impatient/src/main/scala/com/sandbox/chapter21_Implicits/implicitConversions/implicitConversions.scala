package com.sandbox.chapter21_Implicits.implicitConversions

/**
 * Created by Jolin&Vash on 2014/10/4.
 */
import scala.math._

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  override def toString = num + "/" + den
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
}

object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)
}

object implicitConversions {
  implicit def int2Fraction(n: Int) = {println("..............log.................");Fraction(n, 1)}

  def main(args: Array[String]) {
    val result = 3 * Fraction(4, 5) // Calls int2Fraction(3) and print "..............log................." in the console
    println(result)  // 12/5
  }
}
