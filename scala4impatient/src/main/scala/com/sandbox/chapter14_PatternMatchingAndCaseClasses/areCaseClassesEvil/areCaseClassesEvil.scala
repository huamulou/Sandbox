package com.sandbox.chapter14_PatternMatchingAndCaseClasses.areCaseClassesEvil

/**
 * Created by jin1 on 2014/9/17.
 */
object areCaseClassesEvil {
  def main(args: Array[String]) {
    def show(lst: List) {
      lst match {
        case ::(h, t) => { println(h); show(t) }
        case Nil => println("Nil")
      }
    }

    val friends = "Fred" :: "Wilma" :: "Barney" :: Nil
    println(friends)  // ::(Fred,::(Wilma,::(Barney,Nil)))
    println(friends == "Fred" :: "Wilma" :: "Barney" :: Nil)  // true
    println(friends == "Fred" :: "Barney" :: "Wilma" :: Nil)  // false
    // Fred
    // Wilma
    // Barney
    // Nil
    show(friends)
  }
}
