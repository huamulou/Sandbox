package com.sandbox.chapter14_PatternMatchingAndCaseClasses.simulatingEnumerations

/**
 * Created by Jolin&Vash on 2014/9/17.
 */
sealed abstract class TrafficLightColor
case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor

object simulatingEnumerations {
  def main(args : Array[String]){
    for (color <- Array(Red, Yellow, Green))
      println(
        color match {
          case Red => "stop"
          case Yellow => "hurry up"
          case Green => "go"
        })
  }
}
