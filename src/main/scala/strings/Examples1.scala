package strings

object Examples1 extends App {
  val s = " My name vv ? vv bb bb is . ved prakash.singh is "

  def st(s: String): Int = {
    val s1 = s.trim()
    val cc =s1.split("\\.")
    var max = cc(0)


  val count1=cc(0).split("[ ,!.]+ ").size
    val count2 =cc(1).split("[,!.]+ ").size
    if (count1>= count2)
      count1
    else
      count2


  }

  println("String count :" + " " + st(s))
}
