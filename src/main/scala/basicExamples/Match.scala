package basicExamples

object Match extends App {
  var i = 0
  val fizzbuzz = for (i <- 1 to 20) yield {
    /*if (i%3 ==0 && i%5 ==0)"fizzbuzz"
    else if(i%3==0)*/
    (i % 3, i % 5) match {
      case (0, 0) if i < 5 => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => i.toString
    }
  }


}
