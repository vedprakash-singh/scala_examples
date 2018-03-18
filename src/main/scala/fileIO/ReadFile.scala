package fileIO

import scala.io.Source

object ReadFile extends App {
  val path ="src/main/resources/read.txt"
  val read =Source.fromFile(path).getLines.foreach {w => println(w)

  }
}
