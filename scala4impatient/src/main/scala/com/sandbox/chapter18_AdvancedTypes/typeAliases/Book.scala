package com.sandbox.chapter18_AdvancedTypes.typeAliases

/**
 * Created by jin1 on 2014/9/29.
 */
class Book extends Document {
  val tables = new Index
  val figures = new Index

  def addTableRef(title: String, chapter: Int, section: Int) {
    tables += title -> (chapter, section)
  }

  def addFigureRef(caption: String, chapter: Int, section: Int) {
    figures += caption -> (chapter, section)
  }
}
