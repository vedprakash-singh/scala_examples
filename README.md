# scala_examples
Scala each functionality examples
 val:
  val = variable + final
  val is immutable
  val means invariable
  we can not re-assigned the value

 Examples 1:
  val a = 100
  a = 10
  println("val:" + a)

  var:
     var = variable
     val means: Nothing = null
     var is mutable
     var means Variable or Mutable
     that means we can change it’s value once its created.
     we can not re-assigned the value

Examples:
  var b = 100
  b = 10
  println("var:" + b)

  lazy val:
    is used to define Immutable data. It is evaluated only once when we access it for first time.
    That means it is evaluated Lazily.
    it used on time demand.

 Examples:
  lazy val c = {
    println("Constant number is initialized.");
    100
  }
  println("used of lazy val:")
  println(c + 1)

o/p:
val:100
var:10
used of lazy val:
Constant number is initialized.
101

