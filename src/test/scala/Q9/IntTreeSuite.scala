package Q9

import org.scalatest.{BeforeAndAfter, FunSuite}

class IntTreeSuite extends FunSuite with BeforeAndAfter {
  var test: IntTree = _

  before {
    test = EmptyTree.insert(2)
  }

  test("contains is invoked on EmptyTree") {
    assert(!EmptyTree.contains(1))
  }

  test("contains(2) is invoked on Node containing 2") {
    assert(test.contains(2))
  }

  test("contains(1) is invoked on Node not containing 1") {
    assert(!test.contains(1))
  }

  test("insert(1) is invoked on Node") {
    test = test.insert(1)
    assert(test.contains(1))
  }
}
