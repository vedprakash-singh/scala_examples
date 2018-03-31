package basicExamples

object Statement extends App {
  val name = "ved prakash"
  val value = 28
  var age = 25
  /*age += 1
  val t  =(1,2.7,"hi there")
  val msg = name + "is" + (age+1) + "years old."
  val msg2 = s"$name is${age+3} years old."
  val str = s"The second element of t is ${t._2}"*/
  value + age
  value.min(age)
  value min age + 5
  name == "ved prakash" * 5

  // lamda
  //  val square = (x:Double) => x*x
  val square: Double => Double = x => x * x
  val twice: Double => Double = _ * 2
  val lt: (Double, Double) => Boolean = _ < _
  // print(square(3))

  //def square(x: Double): Double = x * x

  //If nad While
  /* var i =0

   while(i<10){
     println(i)
     i+= 1
   }
   */

  //do while

  var i = 0
  do {
    println(i)
    i += 1 // i=i+1
  } while (i < 10)

  //if
  if (age < 18) {
    println("no admittance")
  } else {
    println("cpme on in.")
  }

  // scala if

  val response = if (age < 18) {
    println("no admittance")
  } else {
    println("cpme on in.")
  }

  //

  println(if (age < 18) "no admittance" else "cpme on in.")
  //
  val a = if (true) "hi" else 5
}
