package com.sandbox.chapter13_Collections.mutableLists

/**
 * Created by jin1 on 2014/9/10.
 */
object mutableLists {
  def main(args: Array[String]) {
    val lst1 = scala.collection.mutable.LinkedList(1, -7, 2, -9)
    var cur1 = lst1
    while (cur1 != Nil) {
      if (cur1.elem < 0) cur1.elem = 0
      cur1 = cur1.next
    }

    println(lst1.mkString(","))

    var anotherCur = lst1
    while (anotherCur != Nil && anotherCur.next != Nil) {
      anotherCur.next = anotherCur.next.next
      anotherCur = anotherCur.next
    }

    println(lst1.mkString(","))

    // Remove everything starting from the first negative number

    import scala.collection.mutable.LinkedList

    val lst2 = LinkedList(1, 7, -2, 9)

    var cur2 = lst2
    while (cur2 != Nil && cur2.next != Nil) {
      if (cur2.next.elem < 0)
        cur2.next = LinkedList.empty // DO NOT set to null
      cur2 = cur2.next
    }

    println(lst2.mkString(","))
  }
}
