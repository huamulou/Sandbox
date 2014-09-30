package com.sandbox.chapter18_AdvancedTypes.abstractTypes.abstractTypeConstraint

/**
 * Created by jin1 on 2014/9/30.
 */
trait Listener {
  type Event <: java.util.EventObject
}
