package com.sandbox.chapter4_MapsAndTuples.interoperatingWithJava

/**
 * Created by jin1 on 2014/7/29.
 */
object interoperatingWithJava {
  def main(args: Array[String]) {
    import scala.collection.JavaConversions.mapAsScalaMap
    val scores: collection.mutable.Map[String, Int] =
      new java.util.TreeMap[String, Int]

    scores += ("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props: scala.collection.Map[String, String] = System.getProperties()

    import scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._ // Import keys for map below
    val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map
    val font = new java.awt.Font(attrs) // Expects a Java map
  }
}
