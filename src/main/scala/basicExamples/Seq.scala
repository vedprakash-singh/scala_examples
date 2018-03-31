package basicExamples

object Seq extends App {
  val a = Array(6, 4, 5, 6, 6, 7, 8, 9)
  a.drop(2)
  a.dropRight(2)
  a.head
  a.tail
  a.length
  a(a.length - 1) // last element
  a.splitAt(3)
  a.take(3)
  a.takeRight(3)
  a.slice(2, 5)
  a.patch(3, Array(34, 55, 6), 3)
  a.diff(Array(1, 2, 3, 4))
  a.diff(Array(7, 8, 9))
  Array(1, 2, 3, 4, 5).diff(Array(1, 2, 3))
  a.distinct
  a.intersect(List(2, 3, 4, 5))
  a.union(Array(1, 2, 3, 4, 4))
  a.min
  a.max
  a.sum
  a.product
  a.sorted
  a.mkString
  a.mkString("")
  a.mkString("[", ",", "]")
  a.zip('a' to 'z')
  a.zip('a' to 'c')
  a.zipWithIndex

}
