package com.sandbox.chapter10_Traits.traitsExtendingClasses

/**
 * Created by Jolin&Vash on 2014/9/1.
 */
class UnhappyException extends IllegalStateException
  with LoggedException { // This class extends a trait
  override def getMessage() = "arggh!"
}
