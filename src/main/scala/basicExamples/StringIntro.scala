package basicExamples

object StringIntro extends App {
  val name = "ved prakash"
  val value = 28
  var age = 25
  age += 1
  val t = (1, 2.7, "hi there")
  val msg = name + "is" + (age + 1) + "years old."
  val msg2 = s"$name is${age + 3} years old."
  val str = s"The second element of t is ${t._2}"

}
