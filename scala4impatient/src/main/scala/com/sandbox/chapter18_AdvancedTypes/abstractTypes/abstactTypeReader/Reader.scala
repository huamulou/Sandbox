package com.sandbox.chapter18_AdvancedTypes.abstractTypes.abstactTypeReader

/**
 * Created by jin1 on 2014/9/30.
 */
trait Reader {
  type Contents
  def read(fileName: String): Contents
}
