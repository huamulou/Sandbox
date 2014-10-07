package com.sandbox.chapter22_DelimitedContinuations.CPSAnnotations

/**
 * Created by Jolin&Vash on 2014/10/7.
 */

import scala.util.continuations._

object CPSAnnotations {
  def main(args: Array[String]) {
    var cont : (Unit => Unit) = null
    var filename = "myfile.txt"
    var contents = ""

    def tryRead(): Unit @cps[Unit] = {
      while (contents == "") {
        try {
          contents = scala.io.Source.fromFile(filename, "UTF-8").mkString
        } catch { case _ => }
        shift { k : (Unit => Unit) =>
          cont = k
        }
      }
    }

    reset {
      tryRead()
    }

    if (contents == "") {
      println("Try another filename: ");
      filename = readLine
      cont()
    }
    println(contents)
  }
}
