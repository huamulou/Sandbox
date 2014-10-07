package com.sandbox.chapter22_DelimitedContinuations.transformingNestedControlContexts

/**
 * Created by Jolin&Vash on 2014/10/7.
 */

import scala.util.continuations._

object transformingNestedControlContexts {
  def main(args: Array[String]) {
    var cont: Unit => String = null

    def visit(a: List[String]): String @cps[String] = {
      if (a.isEmpty) "" else {
        shift {
          k: (Unit => String) => {
            cont = k
            a.head
          }
        }
        visit(a.tail)
        println("After visit")
        ""
      }
    }

    reset {
      visit(List("Mary", "had", "a", "little", "lamb"))
    }
    println(cont())
    println(cont())
  }
}

/*
[[syntax trees at end of selectivecps]]// Scala source: cont3.scala
package <empty> {
  final object Main extends java.lang.Object with App with ScalaObject {
    def this(): object Main = {
      Main.super.this();
      ()
    };
    private[this] var cont: Int => Double = null;
    <accessor> def cont: Int => Double = Main.this.cont;
    <accessor> def cont_=(x$1: Int => Double): Unit = Main.this.cont = x$1;
    scala.util.continuations.`package`.reset[Double, Unit]({
      package.this.shiftR[Int, Double, Unit](((k: Int => Double) => Main.this.cont_=(k))).map[Double](((tmp1: Int) => 0.5.*(tmp1).+(1)))
    });
    scala.this.Predef.println(Main.this.cont.apply(10));
    scala.this.Predef.println(Main.this.cont.apply(20))
  }
}
*/
