package com.sandbox.chapter8_Inheritance.objectEquality

/**
 * Created by Jolin&Vash on 2014/8/11.
 */
object objectEquality {
  def main(args: Array[String]) {
    val item1 = new Item("Toaster", 29.95)
    val item2 = new Item("Toaster", 29.95)
    val item3 = new Item("Espresso machine", 199.95)

    println(item1 == item2)  // true
    println(item1 == item3)  // false

    val items = new scala.collection.mutable.HashSet[Item]
    items += item1
    items += item2
    items += item3
    items += item3
    println(items)  // Set(com.sandbox.chapter8_Inheritance.objectEquality.Item[description=Toaster,price=29.95], com.sandbox.chapter8_Inheritance.objectEquality.Item[description=Espresso machine,price=199.95])
  }
}
