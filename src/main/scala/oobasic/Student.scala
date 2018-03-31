package oobasic

class Student(val firstName: String,
              val lastName: String,
              private var _quizzes: List[Int] = Nil,
              private var _assignmnet: List[Int] = Nil,
              private var _tests: List[Int] = Nil) {
  private def validateGrdae(grade: Int): Boolean = grade >= -20 && grade <= 120

  def addQuiz(grade: Int): Boolean = if (validateGrdae(grade)) {
    _quizzes ::= grade
    true
  } else false

  def addAssign(grade: Int): Boolean = if (validateGrdae(grade)) {
    _assignmnet ::= grade
    true
  } else false

  def addTest(grade: Int): Boolean = if (validateGrdae(grade)) {
    _tests ::= grade
    true
  } else false


  def quizAvg: Double = if (_quizzes.isEmpty) 0.0
  else if (_quizzes.length == 1) _quizzes.head
  else (_quizzes.sum - _quizzes.min).toDouble / (_quizzes.length - 1)


  def assignAvg: Double = if (_assignmnet.isEmpty) 0.0
  else
    _assignmnet.sum.toDouble / _tests.length

  def testAvg: Double = if (_tests.isEmpty) 0.0
  else
    _tests.sum.toDouble / _tests.length

  def avg: Double = quizAvg * 0.1 + assignAvg * 0.5 + testAvg * 0.4

  def quizzes = _quizzes

  def assignmnet = _assignmnet

  def tests = _tests
}