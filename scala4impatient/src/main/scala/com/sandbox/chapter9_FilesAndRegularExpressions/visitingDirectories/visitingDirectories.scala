package com.sandbox.chapter9_FilesAndRegularExpressions.visitingDirectories

import java.io.File
import java.nio.file._

/**
 * Created by Jolin&Vash on 2014/8/13.
 */
object visitingDirectories {
  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  def main(args: Array[String]) {
    val home = new File(System.getProperty("user.home"))
    val dirs = subdirs(home)
    for (d <- dirs.take(20))
      println(d)

    Files.walkFileTree(new File("..").toPath, (f: Path) => println(f))
  }
}
