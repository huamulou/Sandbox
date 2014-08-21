package com.sandbox.chapter9_FilesAndRegularExpressions.serialization

import scala.collection.mutable.ArrayBuffer

/**
 * Created by jin1 on 2014/8/21.
 */
class Person(val name: String) extends Serializable {
  val friends = new ArrayBuffer[Person]
  // OK—ArrayBuffer is serializable
  def description = name + " with friends " +
    friends.map(_.name).mkString(", ")
}
