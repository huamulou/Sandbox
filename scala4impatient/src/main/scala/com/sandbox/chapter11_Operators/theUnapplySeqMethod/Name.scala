package com.sandbox.chapter11_Operators.theUnapplySeqMethod

/**
 * Created by jin1 on 2014/9/3.
 */
object Name {
  def unapplySeq(input: String): Option[Seq[String]] =
    if (input.trim == "") None else Some(input.trim.split("\\s+"))
}
