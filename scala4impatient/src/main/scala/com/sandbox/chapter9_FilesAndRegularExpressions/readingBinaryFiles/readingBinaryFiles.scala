package com.sandbox.chapter9_FilesAndRegularExpressions.readingBinaryFiles

import java.io._

/**
 * Created by Jolin&Vash on 2014/8/13.
 */
object readingBinaryFiles {
  def main(args: Array[String]) {
    val file = new File("src/main/resources/repl-session.zip")
    val in = new FileInputStream(file)
    val bytes = new Array[Byte](file.length.toInt)
    in.read(bytes)
    in.close()

    printf("Zip files starts with %c%c, the initials of their inventor.\n",
      bytes(0), bytes(1))
  }
}
