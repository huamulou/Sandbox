package com.sandbox.chapter14_PatternMatchingAndCaseClasses.sealedClasses

/**
 * Created by Jolin&Vash on 2014/9/17.
 */
sealed abstract class Amount

case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
