package com.sandbox.chapter18_AdvancedTypes.dependencyInjection

/**
 * Created by jin1 on 2014/9/29.
 */
import java.io._

trait LoggerComponent {
  trait Logger { def log(msg: String) }

  val logger: Logger

  class ConsoleLogger extends Logger {
    def log(msg: String) { println(msg); }
  }

  class FileLogger(file: String) extends Logger {
    val out = new PrintWriter(file)
    def log(msg: String) { out.println(msg); out.flush() }
  }
}
