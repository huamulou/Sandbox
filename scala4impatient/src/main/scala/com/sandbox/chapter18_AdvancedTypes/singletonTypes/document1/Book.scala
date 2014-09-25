package com.sandbox.chapter18_AdvancedTypes.singletonTypes.document1

/**
 * Created by Jolin&Vash on 2014/9/26.
 */
class Book extends Document {
  private var chapters = new scala.collection.mutable.ArrayBuffer[String]
  def addChapter(chapter: String) = { chapters += chapter; this }
  override def toString = super.toString + "[chapters=" + chapters + "]"
}
