package basicExamples

object HOF extends App {

  val a = Array(1, 2, 3, 4, 5, 6)
  a.foreach(println)
  a.map(_ * 2)
  a.map(x => x * 2)
  a.filter(_ < 5)
  a.filter(_ % 2 == 0)
  a.count(_ % 2 == 0)
  a.exists(_ < 5)
  a.forall(_ < 10)
  a.find(_ % 4 == 0)
  a.partition(_ < 2)
  a.reduce(_ + _)
  a.sum
  a.min
  a.max
  val b = Array("ved", "singh", "is")
  b.minBy(_.length)
  b.min
  b.max

  val a1 = "my name is ved singh"
  a1.filter(_ < 's')
  't'.toInt
  'T'.toInt
  a1.filter(c => "aeiou".contains(c))
  a1.split(" ")


}
