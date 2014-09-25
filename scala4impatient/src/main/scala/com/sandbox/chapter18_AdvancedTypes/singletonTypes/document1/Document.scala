package com.sandbox.chapter18_AdvancedTypes.singletonTypes.document1

/**
 * Created by Jolin&Vash on 2014/9/26.
 */
class Document {
  private var title = ""
  private var author = ""
  // These methods return this.type so they can be used
  // for method chaining, even with subclasses
  def setTitle(title: String): this.type = { this.title = title; this }
  def setAuthor(author: String): this.type = { this.author = author; this }
  override def toString = getClass.getName + "[title=" + title + ",author=" + author + "]"
}

