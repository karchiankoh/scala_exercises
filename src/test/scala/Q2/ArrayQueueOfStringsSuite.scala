package Q2

import org.scalatest.{BeforeAndAfter, FunSuite}

class ArrayQueueOfStringsSuite extends FunSuite with BeforeAndAfter {
  var queue: ArrayQueueOfStrings = _

  before {
    queue = new ArrayQueueOfStrings
  }

  test("get is invoked on empty queue") {
    assert(queue.get == "")
  }

  test("put is invoked on empty queue") {
    queue.put("hello")
    assert(queue.size == 1)
  }

  test("get is invoked on non-empty queue") {
    queue.put("hello world")
    assert(queue.get == "dlrow olleh")
  }

  test("array resizing when put is invoked on non-empty queue") {
    queue.put("hello")
    queue.put("world")
    assert(queue.size == 2)
  }

  test("array resizing when get is invoked on non-empty queue") {
    for (a <- 1 to 4) queue.put(a.toString + "!")
    for (a <- 1 to 3) assert(queue.get == "!" + a.toString)
    assert(queue.size == 1)
  }
}
