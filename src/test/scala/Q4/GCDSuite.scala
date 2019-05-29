package Q4

import org.scalatest.FunSuite

class GCDSuite extends FunSuite {
  test("GCD is invoked when a = b") {
    assert(GCD(13, 13) == 13)
  }

  test("GCD when one argument is a prime") {
    assert(GCD(600, 37) == 1)
  }

  test("GCD when one is a multiple of the other") {
    assert(GCD(20, 100) == 20)
  }

  test("GCD when one is a negative number") {
    assert(GCD(15, -18) == 3)
  }

  test("GCD when one is zero") {
    assert(GCD(15, 0) == 15)
  }

  test("GCD when both are negative numbers") {
    assert(GCD(-15, -18) == 3)
  }
}
