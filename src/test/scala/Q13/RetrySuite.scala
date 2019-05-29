package Q13

import org.scalatest.{BeforeAndAfter, FunSuite}

class RetrySuite extends FunSuite with BeforeAndAfter{
  var i: Int = _
  def success = i += 1
  def fail { i += 1; throw new Exception }

  before {
    i = 0
  }

  test("retry is invoked with failed method, 2 retries and 1000ms sleepTime") {
    retry(fail)(2, 1000)
    assert(i == 3)
  }

  test("retry is invoked with failed method, 2 retries and default sleepTime") {
    retry(fail)(2)
    assert(i == 3)
  }

  test("retry is invoked with failed method, default retries and sleepTime") {
    retry(fail)
    assert(i == 2)
  }


  test("retry is invoked with success method") {
    retry(success)(2)
    assert(i == 1)
  }
}
