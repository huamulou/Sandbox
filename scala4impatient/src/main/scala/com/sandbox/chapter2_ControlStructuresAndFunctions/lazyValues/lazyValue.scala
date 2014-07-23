package com.sandbox.chapter2_ControlStructuresAndFunctions.lazyValues
import javax.swing.JOptionPane._

/**
 * Created by jin1 on 2014/7/22.
 */
object lazyValue {
  def main(args: Array[String]) {

    println("Defining firstName")
    val firstName = showInputDialog("Your First Name")
    println("Printing once")
    println(firstName)
    println("Printing twice")
    println(firstName)

    println("Defining lastName")
    lazy val lastName = showInputDialog("Your Last Name")
    println("Printing once")
    println(lastName)
    println("Printing twice")
    println(lastName)

    println("Defining age")
    def age = showInputDialog("Your Age")
    println("Printing once")
    println(age)
    println("Printing twice")
    println(age)
  }
}
