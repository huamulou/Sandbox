package com.sandbox.chapter18_AdvancedTypes.abstractTypes.typeParameterReader

/**
 * Created by jin1 on 2014/9/30.
 */
import scala.io._

class StringReader extends Reader[String] {
  def read(fileName: String) = Source.fromFile(fileName, "UTF-8").mkString
}
