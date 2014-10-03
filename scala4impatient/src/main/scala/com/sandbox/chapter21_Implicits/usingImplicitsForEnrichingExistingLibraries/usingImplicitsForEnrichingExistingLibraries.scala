package com.sandbox.chapter21_Implicits.usingImplicitsForEnrichingExistingLibraries

/**
 * Created by Jolin&Vash on 2014/10/4.
 */
import java.io.File
import scala.io.Source

class RichFile(val from: File) {
  def read = Source.fromFile(from.getPath).mkString
}

object usingImplicitsForEnrichingExistingLibraries {
  implicit def file2RichFile(from: File) = new RichFile(from)

  def main(args: Array[String]) {
    val contents = new File("src/main/resources/war-and-peace.txt").read
    println(contents)
  }
}
