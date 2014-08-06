package com.sandbox.chapter8_Inheritance.typeChecksAndCasts

/**
 * Created by jin1 on 2014/8/6.
 */
object typeChecksAndCasts {
  def main(args: Array[String]) {
    val r = scala.math.random
    val p = if (r < 0.33) new Person
    else if (r < 0.67) new Employee
    else new Manager
    if (p.isInstanceOf[Employee]) {
      val s = p.asInstanceOf[Employee] // s has type Employee
      println("It's an employee.")
      s.salary = 50000
      if (p.getClass == classOf[Manager]) {
        println("Actually, it's a manager")
        s.salary *= 2
      }
    }
    println(p)
  }
}
