package com.sandbox.chapter3_WorkingWithArrays.interoperatingwithJava



/**
 * Created by Jolin&Vash on 2014/7/28.
 */
object interoperatingwithJava {
  def main(args: Array[String]) {

    import scala.collection.JavaConversions.bufferAsJavaList
    import scala.collection.mutable.ArrayBuffer

    val command = ArrayBuffer("ls", "-al", "/d/work/github")
    val pb = new ProcessBuilder(command) // Scala to Java


    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable.Buffer

    val cmd : Buffer[String] = pb.command() // Java to Scala

    println(cmd == command)  // true
  }
}
