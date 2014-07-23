package com.sandbox.chapter2_ControlStructuresAndFunctions.variableNumOfArguments

/**
 * Created by Jolin&Vash on 2014/7/21.
 */
object variableNumOfArguments {
  def main(args: Array[String]) {

    // this args is Seq type and each argument's Type in args is Int
    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }

    val s = sum(1, 4, 9, 16, 25)
    println(s)    // 55

    /**
     *    it is incorrect if you set a Range type: val s2 = sum(1 to 5) , because it will be recognized as a single
     *    argument which type is not Range but Int instead
     *    you should append :_* to tell the compiler this argument is Seq type
     * */
    val s2 = sum(1 to 5: _*)
    println(s2)    // 15

    def recursiveSum(args: Int*) : Int = {
      if (args.length == 0) 0
      else args.head + recursiveSum(args.tail : _*)
    }

    println(recursiveSum(1, 4, 9, 16, 25))    // 55

    import java.text.MessageFormat

    /**
     *  when you invoking a variable num of args Java method which contains Object type args,
     *  you should transform the primitive, if have, to AnyRef.
     *
     * */
    val str = MessageFormat.format("The answer to {0} is {1}", "everything",
      42.asInstanceOf[AnyRef])
    println(str)   // The answer to everything is 42
  }
}
