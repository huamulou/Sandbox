package com.sandbox.chapter13_Collections.interoperabilityWithJavaCollections

/**
 * Created by jin1 on 2014/9/16.
 */
object interoperabilityWithJavaCollections {
  def main(args : Array[String]){
    import scala.collection.JavaConversions.propertiesAsScalaMap

    val props: scala.collection.mutable.Map[String, String] = System.getProperties()

//    props("com.horstmann.scala") = "impatient"
    props += "com.horstmann.scala" -> "impatient"

    val propValue = System.getProperty("com.horstmann.scala")
    println(propValue)
  }
}
