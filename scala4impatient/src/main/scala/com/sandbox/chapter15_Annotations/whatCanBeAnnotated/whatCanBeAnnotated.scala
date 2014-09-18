package com.sandbox.chapter15_Annotations.whatCanBeAnnotated

/**
 * Created by Jolin&Vash on 2014/9/18.
 */

import scala.reflect.BeanProperty
import javax.inject.Inject
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull
import org.junit.Test
import scala.util.continuations.cps

// Annotation for class
@Entity class Credentials @Inject() (var username: String, var password: String) {
  // Annotation for primary constructor: @Inject()
  @Test def testSomeFeature() {} // Annotation for method
  def doSomething(@NotNull // Annotation for parameter
                  message: String) {}
  @BeanProperty var firstName = "" // Annotation for field
  @BeanProperty @Id // Ok to have more than one annotation
  var lastName = ""
}

// Annotation for type parameter
class MyContainer[@specialized T : Manifest](val length: Int) {
  val values = new Array[T](length)
}

object whatCanBeAnnotated {
  def main(args: Array[String]) {
    // Annotation for type
    def response(status: String): String @cps[Unit] = "[" + status + "]"

    val myMap = Map("Fred" -> 42)
    val key = "Fred"
    // Annotation for expression
    (myMap.get(key): @unchecked) match { case Some(v) => println(v) }
  }
}
