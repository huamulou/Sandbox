package com.sandbox.chapter16_XMLProcessing.loadingAndSaving

/**
 * Created by jin1 on 2014/9/22.
 */
object loadingAndSaving {
  def main(args: Array[String]) {
    import scala.xml._
    val root1 = XML.loadFile("src/main/resources/myfile.xml")

    import scala.io.Source
    import java.io._
    import java.net._
    val root2 = XML.load(new FileInputStream("src/main/resources/myfile.xml"))
    val root3 = XML.load(new InputStreamReader(
      new FileInputStream("src/main/resources/myfile.xml"), "UTF-8"))
    // val root4 = XML.load(new URL("http://horstmann.com/index.html"))
    // This may take a while--see Catalog.scala for more information

    // The ConstructingParser preserves white space and comments
    import xml.parsing.ConstructingParser
    import java.io.File
    val parser1 = ConstructingParser.fromFile(new File("src/main/resources/myfile.xml"), preserveWS = true)
    val root5 = parser1.document.docElem


    val parser2 = ConstructingParser.fromSource(Source.fromURL("http://dict.cn/"), preserveWS = false)

    val doc1 = parser2.document
    val dtd = doc1.dtd
    val docRoot = doc1.docElem

    // Note the <!-- unknown entity auml; -->

    // Add entity declarations to resolve entities

    val parser3 = ConstructingParser.fromSource(Source.fromURL("http://dict.cn/"), preserveWS = false)

    import scala.xml.dtd._

    parser3.ent ++= List(
      "nbsp" -> ParsedEntityDecl("nbsp", IntDef("\u00A0")),
      "auml" -> ParsedEntityDecl("auml", IntDef("\u00E4")))

    parser3.document

    // Or use the XHTML parser

    import scala.xml.parsing._

    val parser4 = new XhtmlParser(Source.fromURL("http://horstmann.com/index.html"))
    val doc2 = parser4.initialize.document

    // Saving

    XML.save("src/main/resources/myfile.xhtml", doc2.docElem,
      enc = "UTF-8",
      xmlDecl = true,
      doctype = DocType("html",
        PublicID("-//W3C//DTD XHTML 1.0 Strict//EN",
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"),
        Nil))

    // Pretty-printing

    val printer = new PrettyPrinter(width = 100, step = 4)
    val str = printer.formatNodes(root5)
  }
}
