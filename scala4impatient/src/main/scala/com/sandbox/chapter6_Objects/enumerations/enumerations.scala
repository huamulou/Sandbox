package com.sandbox.chapter6_Objects.enumerations

import TrafficLightColor2._
import TrafficLightColor3._
/**
 * Created by jin1 on 2014/8/5.
 */
object enumerations {

  def doWhat(color: TrafficLightColor3) = {
    if (color == Red3) "stop"
    else if (color == Yellow3) "hurry up"
    else "go"
  }

  def main(args: Array[String]) {
    println(TrafficLightColor1.Red1)  // Red1
    println(TrafficLightColor1.Red1.id)  // 0

    println(Red2)  // Stop
    println(Yellow2)  // Yellow2
    println(Green2)  // Go
    println(Green2.id)  // 11

    println(doWhat(Yellow3))  // hurry up

    // 0: Red3
    // 1: Yellow3
    // 2: Green3
    for (c <- TrafficLightColor3.values) println(c.id + ": " + c)

    println(TrafficLightColor3(0))  // Red3
    println(TrafficLightColor3.withName("Red3"))  // Red3

  }
}
