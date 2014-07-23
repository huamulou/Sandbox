package com.sandbox.chapter2_ControlStructuresAndFunctions.conditionExpression

/**
 * Created by jin1 on 2014/7/21.
 */
object conditionExpression {
  def main(args: Array[String]) {
     var x : Int = 10
     val intType = if (x > 0) 1 else -1
     println(intType)   // 1

     var anyType : Any = if (x > 0) "positive" else -1
     println(anyType)  // positive
     x = -1
     anyType = if (x > 0) "positive" else -1
     println(anyType)  // -1

     // this expression is equal to "val unitTpe : Unit = if(x > 0) 1 else ()"
     val unitType : Unit = if(x > 0) 1
     println(unitType)  // ()
  }
}
