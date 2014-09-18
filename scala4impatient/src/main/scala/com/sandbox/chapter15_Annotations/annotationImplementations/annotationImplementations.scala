package com.sandbox.chapter15_Annotations.annotationImplementations

/**
 * Created by Jolin&Vash on 2014/9/18.
 */
object annotationImplementations {
  def main(args : Array[String]){
    val creds = new Credentials("Fred")
    creds.pwd = "secret" // Deprecation warning for Scala setter
    println(creds.getPwd()) // Deprecation warning for bean getter
  }
}
