package basicExamples

object TC extends App {
  val str = "123a"
  val num = try {
    str.toInt
  } catch {
    case ex: NumberFormatException => 0
      print(ex)
  }
  print(num)

}
