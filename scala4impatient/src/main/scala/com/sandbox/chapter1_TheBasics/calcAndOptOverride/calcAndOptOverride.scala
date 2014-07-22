package com.sandbox.chapter1_TheBasics.calcAndOptOverride

/**
 * Created by Jolin&Vash on 2014/7/19.
 */
object calcAndOptOverride extends App{
    val a = 1
    val b = 2
    val c = a + b
    val d = a.+(b)
    println(a) //1
    println(b) //2
    println(c) //3
    println(d) //3

    val numsA = 1.to(10)
    val numsB = 1 to 10
    println(numsA)  //Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numsB)  //Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var counter = 0
    counter += 1
    println(counter)  //1
}
