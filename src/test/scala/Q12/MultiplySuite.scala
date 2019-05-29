package Q12

import org.scalatest.FunSuite

class MultiplySuite extends FunSuite{
  test("multiply is invoked on List(1, 2, 3, 4) and Map(1 -> 3, 3 -> 5)") {
    assert(multiply(List(1, 2, 3, 4), Map(1 -> 3, 3 -> 5)) == List(3.0, 15.0))
  }

  test("multiply is invoked on a non-empty list and an empty map") {
    assert(multiply(List(1, 2, 3, 4), Map[Int, Double]()).isEmpty)
  }

  test("multiply is invoked on an empty list and a non-empty map") {
    assert(multiply(List[Int](), Map(1 -> 3, 3 -> 5)).isEmpty)
  }
}
