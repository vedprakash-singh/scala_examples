package strings

object LWF extends App {
  val str = "my name. is ved prakash singh"
  def higestString(str: String): Int = {

    var words= str.split(" ")
    var longest=""
    for(word<- words)
      if(word.length>longest.length)
        longest = word
    longest.length
  }

  println("String count :" + " " + higestString(str))
}
