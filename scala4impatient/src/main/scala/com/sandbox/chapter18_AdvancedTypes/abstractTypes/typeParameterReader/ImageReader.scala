package com.sandbox.chapter18_AdvancedTypes.abstractTypes.typeParameterReader

/**
 * Created by jin1 on 2014/9/30.
 */
import java.awt.image._
import java.io._
import javax.imageio._

class ImageReader extends Reader[BufferedImage] {
  def read(fileName: String) = ImageIO.read(new File(fileName))
}
