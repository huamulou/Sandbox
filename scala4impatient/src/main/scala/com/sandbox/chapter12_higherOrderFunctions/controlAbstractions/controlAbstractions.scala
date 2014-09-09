package com.sandbox.chapter12_HigherOrderFunctions.controlAbstractions

/**
 * Created by jin1 on 2014/9/5.
 */
object controlAbstractions {
  def main(args : Array[String]){

//    def runInThread(block: () => Unit) {
//      new Thread {
//        override def run() { block() }
//      }.start()
//    }
//
//    runInThread { () => println("Hi") ; Thread.sleep(10000); println("Bye") }

    // the snippet code is equal to above commented code
    def runInThread(block: => Unit) {
      new Thread {
        override def run() { block }
      }.start()
    }

    runInThread { println("Hi") ; Thread.sleep(1000); println("Bye") }

    // this method is equal to while loop
    def until(condition: => Boolean)(block: => Unit) {
      if (!condition) {
        block
        until(condition)(block)
      }
    }

    var x = 10
    until (x == 0) {
      x -= 1
      println(x)
    }

    Thread.sleep(10000)
  }
}
