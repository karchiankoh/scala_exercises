package Q15

import org.scalatest.FunSuite

class BetterSeqSuite extends FunSuite {
  test("invoking media on an odd length Int seq") {
    assert(Seq(7, 1, 2, 3, 5).median == 3)
  }

  test("invoking media on an even length Int seq") {
    assert(Seq(7, 1, 2, 3, 5, 11).median == 4)
  }

  test("invoking media on an empty Int seq") {
    assert(Seq[Int]().median == 0)
  }

  test("invoking media on an odd length Double seq") {
    assert(Seq(7.7, 1.1, 2.2, 3.3, 5.5).median == 3.3)
  }
}
