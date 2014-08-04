package com.sandbox.chapter6_Objects.objectsExtendingAClassOrTrait

/**
 * Created by Jolin&Vash on 2014/8/5.
 */
object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
}

