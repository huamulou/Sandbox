package com.sandbox.chapter12_HigherOrderFunctions.parameterInference

/**
 * Created by jin1 on 2014/9/4.
 */
object parameterInference {
  def main(args : Array[String]){
    def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
    val f1 = valueAtOneQuarter((x: Double) => 3 * x)
    println(f1)  // 0.75
    println(f1.getClass.getName)  // double

    val f2 = valueAtOneQuarter((x) => 3 * x)
    println(f2)  // 0.75

    val f3 = valueAtOneQuarter(x => 3 * x)
    println(f3)  // 0.75

    val f4 = valueAtOneQuarter(3 * _)
    println(f4)  // 0.75

    // Error: Can’t infer types
//    val fun1 = 3 * _

    val fun2 = 3 * (_: Double) // OK
    println(fun2(0.25))  // 0.75
    println(fun2.getClass.getName)  // com.sandbox.chapter12_HigherOrderFunctions.parameterInference.parameterInference$$anonfun$5

    val fun3: (Double) => Double = 3 * _ // OK
    println(fun3(0.25))  // 0.75
  }
}
