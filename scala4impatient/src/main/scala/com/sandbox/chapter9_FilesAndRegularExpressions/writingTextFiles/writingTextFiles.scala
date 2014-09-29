package com.sandbox.chapter9_FilesAndRegularExpressions.writingTextFiles

import java.io._

/**
 * Created by Jolin&Vash on 2014/8/13.
 */
object writingTextFiles {
  def main(args: Array[String]) {
    val out = new PrintWriter("src/main/resources/numbers.txt")
    for (i <- 1 to 10) out.print("%6d %10.6f\n".format(i, 1.0 / i))
    out.close()
  }
}
