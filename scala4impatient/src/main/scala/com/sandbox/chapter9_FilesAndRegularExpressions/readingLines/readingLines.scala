package com.sandbox.chapter9_FilesAndRegularExpressions.readingLines

import scala.io.Source

/**
 * Created by jin1 on 2014/8/11.
 */
object readingLines {
  def main(args: Array[String]) {
    val source = Source.fromFile("src/main/mary.txt", "UTF-8")
    try {
      val lineIterator = source.getLines

      for (l <- lineIterator)
        println(if (l.length <= 13) l else l.substring(0, 10) + "...")

      println("===================================================")
      val lines = Source.fromFile("mary.txt", "UTF-8").getLines.toArray

      val contents = Source.fromFile("mary.txt", "UTF-8").mkString

    }finally{
      source.close()
    }


  }
}
