package com.sandbox.chapter9_FilesAndRegularExpressions.serialization


import java.io._
import scala.collection.mutable.ArrayBuffer

/**
 * Created by jin1 on 2014/8/21.
 */
object serialization {
  def main(args: Array[String]) {
    val fred = new Person("Fred")
    val wilma = new Person("Wilma")
    val barney = new Person("Barney")
    fred.friends += wilma
    fred.friends += barney
    wilma.friends += barney
    barney.friends += fred

    val out = new ObjectOutputStream(new FileOutputStream("test.obj"))
    out.writeObject(fred)
    out.close()
    val vash = new Person("Vash")
    //mutate the fred object before serialization
    fred.friends += vash
    println(fred.description)

    val in = new ObjectInputStream(new FileInputStream("test.obj"))
    val savedFred = in.readObject().asInstanceOf[Person]
    in.close()
    println(savedFred.description)
    println(savedFred.friends.map(_.description))
  }
}
