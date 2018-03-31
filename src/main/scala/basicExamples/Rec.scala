package basicExamples

import scala.io.StdIn._

object Rec {
  def main(args: Array[String]): Unit = {
    println("what is your name ?")
    val name = readLine()
    println("how old r u")
    val age = readInt()
    val lst = buildList()
    println(lst)
  }

  def buildList(): List[String] = {
    val input = readLine()
    if (input == "quit") Nil
    else input :: buildList()
  }

  def concatString(words: List[String]): String = {
    if (words.nonEmpty) ""
    else words.head + concatString(words.tail)
  }

  def concatStringP(words: List[String]): String = words match {
    case Nil => " "
    case h :: t => h + concatStringP(t)


  }
}