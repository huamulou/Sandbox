package com.sandbox.chapter21_Implicits.importingImplicits

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

object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)
}

package com.horstmann.impatient {
  object FractionConversions {
    implicit def int2Fraction(n: Int) = Fraction(n, 1)
    implicit def fraction2Double(f: Fraction) = f.num * 1.0 / f.den
  }
}

object importingImplicits {
  def main(args: Array[String]) {
    import com.horstmann.impatient.FractionConversions._

    // to import specific implicit function
    // import com.horstmann.impatient.FractionConversions.fraction2Double

    // to import everything except fraction2Double implicit function
    // import com.horstmann.impatient.FractionConversions.{fraction2Double => _, _}

    val result = 3 * Fraction(4, 5) // Calls int2Fraction(3)
    println(result)  // 2.4000000000000004
  }
}
