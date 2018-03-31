package strings

object REVS extends App {
  val str = "prakash"

  def reverseString(str: String): String = {
/*    val str = "prakash"
    var s = str.split("")
    var reverse = ""
   var ss= for (i <- s.length - 1 to 0 by -1) yield s(i)
    ss.mkString*/
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }


  println("String count :" + " " + reverseString(str))
}
