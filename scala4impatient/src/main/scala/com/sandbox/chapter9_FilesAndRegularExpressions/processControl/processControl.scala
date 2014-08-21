package com.sandbox.chapter9_FilesAndRegularExpressions.processControl

import scala.sys.process._
import java.io.File
import java.net.URL

/**
 * Created by jin1 on 2014/8/21.
 */

object processControl {

  def main(args: Array[String]) {
    "ls -al .." !

    val result = "ls -al .." !!
    val outcome = "ls -al .." #| "grep sec" !

    "ls -al .." #> new File("output.txt") !

    "grep sec" #< new File("output.txt") !

    "ls -al .." #>> new File("output.txt") !

    "grep Scala" #< new URL("http://horstmann.com/index.html") !

    val cmd = "scala script.scala"
    val dirName = "../sec03"
    val p = Process(cmd, new File(dirName), ("LANG", "en_US"))
    "echo 42" #| p !
  }
}
