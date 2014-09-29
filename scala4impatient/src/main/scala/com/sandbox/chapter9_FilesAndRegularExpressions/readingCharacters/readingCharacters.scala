package com.sandbox.chapter9_FilesAndRegularExpressions.readingCharacters

import scala.io.Source

/**
 * Created by jin1 on 2014/8/13.
 */
object readingCharacters {
  def readWord(iter: BufferedIterator[Char]) = {
    val builder = new StringBuilder
    while (iter.hasNext && !Character.isWhitespace(iter.head))
      builder += iter.next()
    builder
  }

  def main(args: Array[String]) {
    val source = Source.fromFile("src/main/resources/mary.txt", "UTF-8")
    val iter = source.buffered

    while (iter.hasNext) {
      print(readWord(iter))
      if (iter.next == '\n') println() else print(",")
    }
    source.close()
  }
}
