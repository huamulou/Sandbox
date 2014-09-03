package com.sandbox.chapter11_Operators.associativity

/**
 * Created by jin1 on 2014/9/3.
 */
object associativity {
  def main(args : Array[String]){
    17 - 2 - 9 // - is left associative
    (17 - 2) - 9
    17 - (2 - 9)

    1 :: 2 :: Nil // :: is right associative
    1 :: (2 :: Nil)

    // Error since :: can't be applied to 2
//    (1 :: 2) :: Nil

    var a: Any = 3
    a = a = 4 // = is right associative
    a = (a = 4)

    // Error since = can't be applied to ()
//    (a = a) = 4

    var l = List(1, 2, 3)

    l = 4 :: l
    println(l)  // List(4, 1, 2, 3)
    // :: is a member of the operand to the right since it ends in a colon
    l = l.::(5)
    println(l)  // List(5, 4, 1, 2, 3)

    l ::= 6
    // ::=  is a member of the operand to the left since it doesn't end in a colon
    println(l)  // List(6, 5, 4, 1, 2, 3)
  }
}
