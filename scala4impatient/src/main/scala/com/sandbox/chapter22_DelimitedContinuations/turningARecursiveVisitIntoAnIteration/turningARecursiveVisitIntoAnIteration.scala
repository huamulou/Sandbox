package com.sandbox.chapter22_DelimitedContinuations.turningARecursiveVisitIntoAnIteration

/**
 * Created by Jolin&Vash on 2014/10/7.
 */
import scala.util.continuations._
import java.io._

object turningARecursiveVisitIntoAnIteration {
  def main(args: Array[String]) {
    var cont : (Unit => Unit) = null
    def processDirectory(dir : File) : Unit @cps[Unit] = {
      val files = dir.listFiles
      var i = 0
      while (i < files.length) {
        val f = files(i)
        i += 1
        if (f.isDirectory)
          processDirectory(f)
        else {
          shift {
            k: (Unit => Unit) => {
              cont = k // step2
            }
          } // step5
          println(f)
        }
      }
    }
    reset {
      processDirectory(new File("/")) // step1
    } // step3
    for (i <- 1 to 100) cont() // step4
  }
}
