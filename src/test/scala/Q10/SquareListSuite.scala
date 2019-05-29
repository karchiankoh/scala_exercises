package Q10

import org.scalatest.FunSuite

class SquareListSuite extends FunSuite{
  val empty = List[Int]()
  val input = List(-2, -1, 0, 1, 2)
  val invalidInput = List(Int.MinValue)
  val output = List(4, 1, 0, 1, 4)

  test("squareList is invoked on (-2, -1, 0, 1, 2)") {
    assert(squareList(input) == output)
  }

  test("squareList is invoked on (Int.MinValue)") {
    try {
      squareList(invalidInput)
      fail
    } catch {
      case ex: IllegalArgumentException =>
      case _ => fail
    }
  }

  test("squareList is invoked on empty list") {
    assert(squareList(empty).isEmpty)
  }

  test("squareMapList is invoked on (-2, -1, 0, 1, 2)") {
    assert(squareMapList(input) == output)
  }

  test("squareMapList is invoked on (Int.MinValue)") {
    try {
      squareMapList(invalidInput)
      fail
    } catch {
      case ex: IllegalArgumentException =>
      case _ => fail
    }
  }

  test("squareMapList is invoked on empty list") {
    assert(squareMapList(empty).isEmpty)
  }
}
