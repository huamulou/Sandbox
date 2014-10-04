package com.sandbox.chapter21_Implicits.rulesForImplicitConversions

/**
 * Created by Jolin&Vash on 2014/10/4.
 */
import scala.math._

class Fraction(n: Int, d: Int) {
  val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  override def toString = num + "/" + den
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
}

object rulesForImplicitConversions {
  def main(args: Array[String]) {
    implicit def int2Fraction(n: Int) = new Fraction(n, 1)
    implicit def fraction2Double(f: Fraction) = f.num * 1.0 / f.den
    implicit def fraction2String(f: Fraction) = f.toString

    val f = new Fraction(3, 4)

    3 * 4 // No conversion--compiles as is

    f * 5 // Not ambiguous--applies conversion to 5

    5 * f // Not ambiguous--applies conversion to f

    implicit def fraction2List(f: Fraction) = List(f.num, f.den)

    f ++ f // converts f to List

    implicit def fraction2Map(f: Fraction) = Map(f.num -> f.den)

    // ambiguous--could convert to list or map
    // f ++ f

    // Won't try fraction2String(int2Fraction(3))
    // val s: String = 3
  }
}
