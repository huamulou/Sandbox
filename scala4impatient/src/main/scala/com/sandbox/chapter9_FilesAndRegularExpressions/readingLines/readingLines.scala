package com.sandbox.chapter9_FilesAndRegularExpressions.readingLines

import scala.io.Source

/**
 * Created by jin1 on 2014/8/11.
 */
object readingLines {
  def main(args: Array[String]) {
    val source1 = Source.fromFile("src/main/resources/mary.txt", "UTF-8")
    val source2 = Source.fromFile("src/main/resources/mary.txt", "UTF-8")
    val source3 = Source.fromFile("src/main/resources/mary.txt", "UTF-8")
    try {
      val lineIterator = source1.getLines

      for (l <- lineIterator)
        println(if (l.length <= 13) l else l.substring(0, 10) + "...")

      println("===================================================")
      val lines = source2.getLines.toArray.mkString("\n")
      println(lines)

      println("===================================================")
      val contents = source3.mkString
      println(contents)

    }finally{
      source1.close()
      source2.close()
      source3.close()
    }


  }
}
