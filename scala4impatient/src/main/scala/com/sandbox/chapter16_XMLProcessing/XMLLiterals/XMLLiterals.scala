package com.sandbox.chapter16_XMLProcessing.XMLLiterals

/**
 * Created by Jolin&Vash on 2014/9/21.
 */
object XMLLiterals {
  def main(args : Array[String]){
    val doc = <html><head><title>Fred's Memoirs</title></head><body>...</body></html>;

    val items = <li>Fred</li><li>Wilma</li>;

    val (x, y) = (1, 2)
    x < y // OK
    x<y // OK

    // Error—unclosed XML literal
//    x <y
  }
}
