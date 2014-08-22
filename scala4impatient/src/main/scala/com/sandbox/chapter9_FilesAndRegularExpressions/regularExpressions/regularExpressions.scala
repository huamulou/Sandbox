package com.sandbox.chapter9_FilesAndRegularExpressions.regularExpressions

/**
 * Created by jin1 on 2014/8/22.
 */
object regularExpressions {
  def main(args: Array[String]) {
    val numPattern = "[0-9]+".r

    val wsnumwsPattern = """\s+[0-9]+\s+""".r

    for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles"))
      println(matchString) // 99\n98\n

    val m1 = wsnumwsPattern.findFirstIn("99 bottles, 98 bottles")
    println(m1.get) //  98

    println(numPattern.findPrefixOf("99 bottles, 98 bottles"))  // Some(99)

    println(wsnumwsPattern.findPrefixOf("99 bottles, 98 bottles"))  // None

    println(numPattern.replaceFirstIn("99 bottles, 98 bottles", "XX"))  // XX bottles, 98 bottles

    println(numPattern.replaceAllIn("99 bottles, 98 bottles", "XX"))  // XX bottles, XX bottles
  }
}
