package com.sandbox.chapter18_AdvancedTypes.abstractTypes.abstractTypeConstraint

/**
 * Created by jin1 on 2014/9/30.
 */
trait ActionListener {
  type Event = java.awt.event.ActionEvent // OK, it’s a subtype
}
