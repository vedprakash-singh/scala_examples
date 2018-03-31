package basicExamples

object CURR {
  def main(args: Array[String]): Unit = {
    val plus = add(3) _
    val eigt = plus(5)
    println(threeTupple(math.random))
  }

  def add(x: Int)(y: Int): Int = x + y

  def threeTupple(a: Double): (Double, Double, Double) = {
    (a, a, a)
  }
}
