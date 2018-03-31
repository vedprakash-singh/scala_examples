package basicExamples

object ArrayAndList extends App {
  val arr = Array(1, 2, 3, 4, 5, 5)
  val lst = List(1, 2, 3, 4, 5, 5, 67, 7)
  val str = List("v", "e", "d")
  'p' :: str
  println(str.toArray)
  println(arr.toList)

  println(arr(0))
  println(lst(0))

  println(Array.fill(100)(0))
  println(List.fill(100)(math.random))
  println(List.fill(5)(io.StdIn.readLine()))

  println(Array.tabulate(10)(i => i * i))
  println(new Array[Int](20))
}
