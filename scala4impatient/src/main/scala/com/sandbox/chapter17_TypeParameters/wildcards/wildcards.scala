package com.sandbox.chapter17_TypeParameters.wildcards

/**
 * Created by jin1 on 2014/9/25.
 */

object wildcards {

  def main(args: Array[String]) {
    def makeFriends(p: Pair[_ <: Person]) =
      p.first.name + " and " + p.second.name + " are now friends."

    val fred = new Student("Fred")
    val wilma = new Student("Wilma")

    val studentPair = new Pair(fred, wilma)

    makeFriends(studentPair) // OK

    import java.util.Comparator
    def min1[T](p: Pair[T])(comp: Comparator[_ >: T]) =
      if (comp.compare(p.first, p.second) < 0) p.first else p.second

    // Just a silly example
    val sillyHashComp = new Comparator[Object] {
      def compare(a: Object, b: Object) = a.hashCode() - b.hashCode()
    }

    "Fred".hashCode
    "Wilma".hashCode

    // Note that the comparator uses a supertype of T = String
    min1(new Pair("Fred", "Wilma"))(sillyHashComp)

    // This should work, but it doesn't in Scala 2.9
    // def min2[T <: Comparable[_ >: T]](p: Pair[T]) =
    //  if (p.first.compareTo(p.second) < 0) p.first else p.second

    // Here is a workaround
    type SuperComparable[T] = Comparable[_ >: T]
    def min3[T <: SuperComparable[T]](p: Pair[T]) =
      if (p.first.compareTo(p.second) < 0) p.first else p.second

    // Note that Student <: Comparable[Person]
    val anotherFred = new AnotherStudent("Fred")
    val anotherWilma = new AnotherStudent("Wilma")

    val anotherStudentPair = new Pair(anotherFred, anotherWilma)
    min3(anotherStudentPair)

  }
}
