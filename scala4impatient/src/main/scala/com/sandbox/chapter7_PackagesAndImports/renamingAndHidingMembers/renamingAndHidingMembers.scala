package com.sandbox.chapter7_PackagesAndImports.renamingAndHidingMembers

/**
 * Created by jin1 on 2014/8/6.
 */
object renamingAndHidingMembers {
  def main(args: Array[String]) {
    // use selector to import several members or classes under the package
    import java.awt.{Color, Font}

    Color.RED
    Font.BOLD

    // rename java.util.HashMap to JavaHashMap
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable._

    new JavaHashMap[String, Int]
    new HashMap[String, Int]

    // hide the java.util.HashSet and import the rest classes under the package java.util
    import java.util.{HashSet => _, _}
    import scala.collection.mutable._
    // then the HashSet is no doubt to stand for scala.collection.mutable.HashSet
    new HashSet[String]
  }
}
