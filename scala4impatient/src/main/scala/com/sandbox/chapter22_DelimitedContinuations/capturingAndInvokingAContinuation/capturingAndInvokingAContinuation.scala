package com.sandbox.chapter22_DelimitedContinuations.capturingAndInvokingAContinuation

import scala.util.continuations._

object capturingAndInvokingAContinuation {
  def main(args : Array[String]){
    var cont : (Unit => Unit) = null
    var filename = "myfile.txt"
    var contents = ""
    var count:Int = 0

    reset {
      while (contents == "") {
        try {
          contents = scala.io.Source.fromFile(filename, "UTF-8").mkString
        } catch { case _ => }
        // record the entry times
        count += 1

        shift { k : (Unit => Unit) =>
          cont = k
          if(count == 1){
            println("prepare saving continuation point")
          }else if(count == 2){
            println("prepare saving continuation point second time")
          }else{
            println("count is " + count)
          }
        }
        println("continuation start")
        println("execute while loop one more time since the loop is in reset scope")
      }
      println("out of while loop") // won't print since the continuation is ended before println
    }

    if (contents == "") {
      println("Try another filename: ");
      filename = readLine

      /**
       * goto continuation point and print below:
       *
       *   prepare saving continuation point
       *   Try another filename:
       *    ... file name ...
       *   continuation start
       *   execute while loop one more time since the loop is in reset scope
       *   prepare saving continuation point second time
       *   ... file content ...
       *   continuation start
       *   execute while loop one more time since the loop is in reset scope
       *   count is 3
       *
       * */
      cont()
    }
    println(contents)
    cont()
  }
}