package com.sandbox.chapter2_ControlStructuresAndFunctions.loops

/**
 * Created by jin1 on 2014/7/21.
 */
object loops {
  def main(args: Array[String]) {
    var n = 10
    var r = 1
    while (n > 0){
      r = r * n
      n -= 1
    }
    println(r)   // 3628800

    for (i <- 1 to n){
      r = r * i
    }
    println(r)   // 3628800

    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length){
      println(s(i))
    }

    val str = "World"
    for (ch <- str){
      println(ch)
    }

    import scala.util.control.Breaks._
    breakable {
      for (ch <- "Hello World") {
        if (ch == ' ') break; // Exits the breakable block
        println(ch)
      }
    }

  }
}
