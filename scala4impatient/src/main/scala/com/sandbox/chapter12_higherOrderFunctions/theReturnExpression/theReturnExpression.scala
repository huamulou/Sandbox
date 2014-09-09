package com.sandbox.chapter12_HigherOrderFunctions.theReturnExpression

/**
 * Created by Jolin&Vash on 2014/9/9.
 */
object theReturnExpression {

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  /**
   * http://www.scala-lang.org/docu/files/ScalaReference.pdf
   *  Scala Language Spec, section 6.20 Return Expressions:
   *
   *  Returning from a nested anonymous function is implemented by throwing and catching a
   *  scala.runtime.NonLocalReturnException. Any exception catches between the point of return and the
   *  enclosing methods might see the exception. A key comparison makes sure that these exceptions are
   *  only caught by the method instance which is terminated by the return.
   *
   *  If the return expression is itself part of an anonymous function, it is possible that the enclosing
   *  instance of f has already returned before the return expression is executed. In that case, the thrown
   *  scala.runtime.NonLocalReturnException will not be caught, and will propagate up the call stack.
   * */
//  def indexOf(str: String, ch: Char): Int = {
//    var i = 0
//    until (i == str.length) {
//      if (str(i) == ch) return i
//      i += 1
//    }
//    -1
//  }

  def indexOf(str: String, ch: Char): Int = {
    var i = 0
    try {
      until (i == str.length) {
        if (str(i) == ch) {
          println("index " + i)
          return i
        }
        println(i)
        i += 1
      }
    } catch {
//      case t: Throwable => println(t)
      /**
       * Returning from a nested anonymous function raises scala.runtime.NonLocalReturnControl exception which is caught by the host function or method.
       * And if the exception is caught before throw up to the named method outside, the value of return expression won't be returned. So in this case
       * below, it has to return the value again in the catch block if you want to return the index while ignoring the NonLocalReturnControl exception
       * */
      case e:scala.runtime.NonLocalReturnControl[Int] => {println("e.value is " + e.value);return e.value}
    }
    -1
  }

  def main(args: Array[String]) {
    val rv1 = indexOf("Hello", 'l')
    println(rv1)

    val rv2 = indexOf("Hello", '!')
    println(rv2)
  }
}
