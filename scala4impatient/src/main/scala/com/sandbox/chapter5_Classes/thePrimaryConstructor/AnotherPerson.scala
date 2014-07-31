package com.sandbox.chapter5_Classes.thePrimaryConstructor

/**
 * Created by jin1 on 2014/7/31.
 */
class AnotherPerson (val name: String, private var age: Int){
  def description = name + " is " + age + " years old"
  def birthday() { age += 1 }
}
