package Q5

import org.scalatest.FunSuite

class TimeitSuite extends FunSuite {
  test("timeit { (1 to 1000).sum }") {
    assert(timeit { (1 to 1000).sum } == 500500 )
  }
}
