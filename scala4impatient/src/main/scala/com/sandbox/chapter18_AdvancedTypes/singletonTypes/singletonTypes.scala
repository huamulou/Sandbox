package com.sandbox.chapter18_AdvancedTypes.singletonTypes

import com.sandbox.chapter18_AdvancedTypes.singletonTypes.document1.Book
import com.sandbox.chapter18_AdvancedTypes.singletonTypes.document2.{Document, Title}

/**
 * Created by Jolin&Vash on 2014/9/26.
 */
object singletonTypes {
  def main(args: Array[String]) {
    val book1 = new Book
    book1.setTitle("Scala for the Impatient").addChapter("Chapter 1 ...")
    println(book1)

    val book2 = new Document
    book2 set Title to "Scala for the Impatient"
    println(book2)
  }
}
