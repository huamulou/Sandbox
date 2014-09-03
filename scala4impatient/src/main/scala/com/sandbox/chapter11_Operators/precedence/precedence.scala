package com.sandbox.chapter11_Operators.precedence

/**
 * Created by jin1 on 2014/9/3.
 */
object precedence {
  def main(args: Array[String]) {
    1 + 2 * 3 // * has higher precedence than +
    1 + (2 * 3)
    (1 + 2) * 3

    1 + 4 | 9 // | has lower precedence than +
    (1 + 4) | 9
    1 + (4 | 9)

    1 + 2 to 10 // to has lower precedence than +

    1 -> 2 * 3 // * has higher precedence than ->
    1 + 2 -> 3 // + has the same precedence as ->

    // Error--can't apply + to a pair
//    1 -> 2 + 3

    1 to 10 toString // Postfix operators have lower precedence than infix
  }
}
