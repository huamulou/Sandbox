package com.sandbox.chapter13_Collections.mappingAFunction

/**
 * Created by jin1 on 2014/9/11.
 */
object mappingAFunction {
  def main(args: Array[String]) {
    val names = List("Peter", "Paul", "Mary")

    val v1 = names.map(_.toUpperCase)
    println(v1.mkString(","))  // PETER,PAUL,MARY

    val v2 = for (n <- names) yield n.toUpperCase
    println(v2.mkString(","))  // PETER,PAUL,MARY

    def ulcase(s: String) = Vector(s.toUpperCase(), s.toLowerCase())

    val list1 = names.map(ulcase(_))
    val list2 = names.flatMap(ulcase)
    println(list1.mkString(","))  // Vector(PETER, peter),Vector(PAUL, paul),Vector(MARY, mary)
    println(list2.mkString(","))  // PETER,peter,PAUL,paul,MARY,mary

    val v3 = "-3+4".collect { case '+' => 1 ; case '-' => -1 }
    println(v3.mkString(","))  // -1,1

    // Peter
    // Paul
    // Mary
    names.foreach(println)
  }
}
