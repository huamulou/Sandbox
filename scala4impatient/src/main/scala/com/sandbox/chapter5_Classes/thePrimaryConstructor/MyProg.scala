package com.sandbox.chapter5_Classes.thePrimaryConstructor

import java.util.Properties
import java.io.FileReader

/**
 * Created by jin1 on 2014/7/31.
 */
class MyProg {
  private val props = new Properties
  props.load(new FileReader("myprog.properties"))
  // The statement above is a part of the primary constructor
}
