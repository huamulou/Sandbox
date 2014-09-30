package com.sandbox.chapter18_AdvancedTypes.abstractTypes.multiTypeDependencyReader

/**
 * Created by jin1 on 2014/9/30.
 */
import java.awt.image._
import java.io._
import javax.imageio._

class ImageReader extends Reader {
  type In = File
  type Contents = BufferedImage
  def read(file: In) = ImageIO.read(file)
}
