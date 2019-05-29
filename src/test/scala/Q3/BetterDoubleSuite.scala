package Q3

import org.scalatest.FunSuite

class BetterDoubleSuite extends FunSuite {
  test("equal values") {
    assert(0.3 ~= 0.3)
  }

  test("not equal values") {
    assert(!(0.3 ~= 0.31))
  }

  test("equal values with configured constant of 0.1") {
    assert(0.3.~=(0.31)(0.1))
  }

  test("not equal values with configured constant of 0.1") {
    assert(0.3.~=(0.311)(0.1))
  }

  test("equal expressions") {
    assert((0.15 + 0.15) ~= (0.1 + 0.2))
  }

  test("not equal expressions") {
    assert(!((0.151 + 0.15) ~= (0.1 + 0.2)))
  }

  test("both zero") {
    assert(0 ~= 0)
  }

  test("both Double.MaxValue") {
    assert(Double.MaxValue ~= Double.MaxValue)
  }

  test("both Double.MinValue") {
    assert(Double.MinValue ~= Double.MinValue)
  }
}
