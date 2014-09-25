package com.sandbox.chapter18_AdvancedTypes.singletonTypes.document2

/**
 * Created by Jolin&Vash on 2014/9/26.
 */
class Document {
  private var title = ""
  private var useNextArgAs: Any = null
  def set(obj: Title.type): this.type = { useNextArgAs = obj; this }
  def to(arg: String) = if (useNextArgAs == Title) title = arg;
  override def toString = getClass.getName + "[title=" + title + "]"
}
