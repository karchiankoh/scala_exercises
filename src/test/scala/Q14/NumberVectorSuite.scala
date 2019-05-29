package Q14

import org.scalatest.FunSuite

class NumberVectorSuite extends FunSuite {
  test("(-2, -1, 0, 1, 2) NumberVector is instantiated") {
    val numVect = new NumberVector(Vector(-2, -1, 0, 1, 2))
    val xOutput = Vector(4, 1, 0, 1, 4)
    assert(numVect.x == xOutput)
    assert(numVect.y == 10)
    assert(numVect.z.compare(3.1622776601683795) == 0)
  }

  test("(Int.MinValue, Int.MaxValue) NumberVector is instantiated") {
    try {
      val numVect = new NumberVector(Vector(Int.MinValue, Int.MaxValue))
      fail
    } catch {
      case ex: IllegalArgumentException =>
      case _ => fail
    }
  }

  test("empty NumberVector is instantiated") {
    val emptyVect = new NumberVector(Vector[Long]())
    assert(emptyVect.x.isEmpty)
    assert(emptyVect.y == 0)
    assert(emptyVect.z == 0)
  }
}
