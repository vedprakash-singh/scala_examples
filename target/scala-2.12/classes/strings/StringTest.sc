import java.io.PrintWriter

import scala.io.Source

val source =Source.fromFile("src/matrix.txt")
val lines = source.getLines()
val matrix = lines.map(line=>line.split(" ").map(_.toDouble)).toArray
source.close()

val pw = new PrintWriter("rowSums.txt")
matrix.foreach{row => pw.println(row.sum)

pw.close()


