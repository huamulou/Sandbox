package com.sandbox.chapter17_TypeParameters.typeConstraints

/**
 * Created by jin1 on 2014/9/23.
 */

// <:< allows to instantiate a class even though some methods
// may not be applicable
class Pair[T](val first: T, val second: T) {
  def smaller(implicit ev: T <:< Ordered[T]) =
    if (first < second) first else second
}

object typeConstraints {
  def main(args: Array[String]) {
    import java.io.File

    // Ok as long as we don't call smaller
    val p = new Pair(new File("."), new File(".."))

    // Error:(21, 7) Cannot prove that java.io.File <:< Ordered[java.io.File].
    // p.smaller

    // <:< is used in the definition of the Option.orNull method
    val friends = Map("Fred" -> "Barney")
    val friendOpt = friends.get("Wilma") // An Option[String]
    val friendOrNull = friendOpt.orNull // A String or null

    val scores = Map("Fred" -> 42)
    val scoreOpt = scores.get("Fred") // An Option[Int]
    // Error because null is illegal value to the type Int.
    // val scoreOrNull = scoreOpt.orNull

    // <:< can improve type inference
    def firstLast1[A, C <: Iterable[A]](it: C) = (it.head, it.last)

    // Error
    // firstLast1(List(1, 2, 3))

    // using currying parameter see the page 251 for details
    def firstLast2[A, C](it: C)(implicit ev: C <:< Iterable[A]) =
      (it.head, it.last)

    firstLast2(List(1, 2, 3)) // OK

  }
}
