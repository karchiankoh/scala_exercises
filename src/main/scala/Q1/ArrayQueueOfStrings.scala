package Q1

// create a class that implements it using an array
class ArrayQueueOfStrings extends QueueOfStrings {
  private var q = Array.fill[String](1)("")
  private var head, tail = 0
  private var _size = 0

  def size = _size

  def put(s: String) = {
    if (_size == q.length)
      resize(2 * q.length)
    q(tail) = s
    _size += 1
    tail = (tail + 1) % q.length
    s
  }

  def get(): String = {
    if (_size == 0) ""
    else {
      val temp = q(head)
      q(head) = ""
      _size -= 1
      head = (head + 1) % q.length
      if (_size > 0 && _size == q.length / 4)
        resize(q.length / 2)
      temp
    }
  }

  private def resize(capacity: Int) = {
    var copy = Array.fill[String](capacity)("")
    if (head < tail)
      Array.copy(q, head, copy, 0, _size)
    else {
      Array.copy(q, head, copy, 0, q.length - head)
      Array.copy(q, 0, copy, q.length - head, tail)
    }
    q = copy
    head = 0
    if (_size == capacity) tail = 0 else tail = _size
  }
}
