package com.sandbox.chapter6_Objects.objectsExtendingAClassOrTrait

/**
 * Created by Jolin&Vash on 2014/8/5.
 */
abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
