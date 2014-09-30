package com.sandbox.chapter18_AdvancedTypes.abstractTypes.typeParameterReader

/**
 * Created by jin1 on 2014/9/30.
 */
trait Reader[C] {
  def read(fileName: String): C
}
