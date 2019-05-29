package Q8

import org.scalatest.FunSuite

class IntSetSuite extends FunSuite {
  val empty = new EmptySet
  val odd = new NonEmptySet(1, new EmptySet, new EmptySet).incl(3).incl(5)
  val even = new NonEmptySet(4, new EmptySet, new EmptySet).incl(2).incl(6)
  val total = new NonEmptySet(1, new EmptySet, new EmptySet).incl(3).incl(5).incl(4).incl(2).incl(6)

  test("union is invoked on two empty sets") {
    assert(empty.union(empty).isEmpty)
  }

  test("union is invoked on empty and odd set") {
    assert(empty.union(odd).toArrayBuffer.sorted == odd.toArrayBuffer.sorted)
  }

  test("union is invoked on odd and even set") {
    assert(odd.union(even).toArrayBuffer.sorted == total.toArrayBuffer.sorted)
  }

  test("union is invoked on total and odd set") {
    assert(total.union(odd).toArrayBuffer.sorted == total.toArrayBuffer.sorted)
  }

  test("intersection is invoked on empty and empty set") {
    assert(empty.intersection(empty).isEmpty)
  }

  test("intersection is invoked on empty and odd set") {
    assert(empty.intersection(odd).isEmpty)
  }

  test("intersection is invoked on odd and even set") {
    assert(odd.intersection(even).isEmpty)
  }

  test("intersection is invoked on total and odd set") {
    assert(total.intersection(odd).toArrayBuffer.sorted == odd.toArrayBuffer.sorted)
  }
}
