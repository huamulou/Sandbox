package com.sandbox.chapter18_AdvancedTypes.typeAliases

import scala.collection.mutable.HashMap

/**
 * Created by jin1 on 2014/9/29.
 */

object typeAliases {
  def main(args: Array[String]) {
    type map = HashMap[String, (Int, Int)]
    val hashMap = new map
    hashMap += "Chapter18" -> (18,4)

    println(hashMap)

    val bookFigure = new Book
    bookFigure.addFigureRef("Chapter18",18,4)
    println(bookFigure.figures)

  }
}
