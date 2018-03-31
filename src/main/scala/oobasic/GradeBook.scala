package oobasic

object GradeBook {
  def main(args: Array[String]): Unit = {
    val student = List(new Student("ved", "singh"), new Student("ravi", "singh"))
    for (s <- student) printStudent(s)
  }

  def printStudent(s: Student): Unit = {
    println(s.firstName + " " + s.lastName)
    println("grade=" + s.avg)
    println("Tests =" + s.tests.mkString(","))
  }

}
