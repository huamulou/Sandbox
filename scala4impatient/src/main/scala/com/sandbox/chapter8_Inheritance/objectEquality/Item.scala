package com.sandbox.chapter8_Inheritance.objectEquality

/**
 * Created by Jolin&Vash on 2014/8/11.
 */
class Item(val description: String, val price: Double) {
  final override def equals(other: Any) = {
    val that = other.asInstanceOf[Item]
    if (that == null) false
    else description == that.description && price == that.price
  }

  // /* Try commenting out hashCode
  final override def hashCode =
    13 * description.hashCode + 17 * price.hashCode
  // */

  override def toString = getClass.getName + "[description=" +
    description + ",price=" + price + "]"
}
