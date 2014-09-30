package com.sandbox.chapter18_AdvancedTypes.abstractTypes.multiTypeDependencyReader

/**
 * Created by jin1 on 2014/9/30.
 */
trait Reader {
  type In
  type Contents
  def read(in: In)
}
