package com.sandbox.chapter7_PackagesAndImports.packages

/**
 * Created by jin1 on 2014/8/5.
 */
package org {
  package bigjava {
    class Counter {
     private var value = 0
      def increment() { value += 1 }
      def description = "A counter with value " + value
    }
  }
}
