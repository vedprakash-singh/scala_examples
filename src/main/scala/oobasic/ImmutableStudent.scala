package oobasic

class ImmutableStudent (val firstName: String,
                        val lastName: String,
                        val quizzes: List[Int] = Nil,
                        val assignmnet: List[Int] = Nil,
                        val tests: List[Int] = Nil) {

  def addQuiz(grade: Int):ImmutableStudent = new ImmutableStudent(
    firstName,
    lastName,
    grade::quizzes,
    assignmnet,
    tests
  )
  def addAssign(grade: Int):ImmutableStudent = new ImmutableStudent(
    firstName,
    lastName,
    grade::quizzes,
    assignmnet,
    tests
  )
  def addTest(grade: Int):ImmutableStudent = new ImmutableStudent(
    firstName,
    lastName,
    grade::quizzes,
    assignmnet,
    tests
  )

  def quizAvg: Double = if (quizzes.isEmpty) 0.0
  else if (quizzes.length == 1) quizzes.head
  else (quizzes.sum - quizzes.min).toDouble / (quizzes.length - 1)


  def assignAvg: Double = if (assignmnet.isEmpty) 0.0
  else
    assignmnet.sum.toDouble / tests.length

  def testAvg: Double = if (tests.isEmpty) 0.0
  else
    tests.sum.toDouble / tests.length

  def avg: Double = quizAvg * 0.1 + assignAvg * 0.5 + testAvg * 0.4
}
