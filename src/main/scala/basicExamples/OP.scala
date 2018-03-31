package basicExamples

object OP {
  val a = Array(1, 2, 3, 4, 3, 4, 9, 4, 2, 8)
  val c = a.find(_ > 10)
  val b = a.find(_ < 3)
  b.get
  b match {
    case Some(i) => println(s"founf $i")
    case None => println("Nothing found")

  }

  c.getOrElse(0)

  b.map(_ * 2)
  c.map(_ * 2)

}
