package Q11

import org.scalatest.FunSuite

class GetOptionSuite extends FunSuite {
  test("getOption is invoked on (None, None, None)") {
    assert(getOption(None, None, None) == None)
  }

  test("getOption is invoked on (None, None, Int)") {
    assert(getOption(None, None, Some(123)) == Some(123))
  }

  test("getOption is invoked on (None, String, Int)") {
    assert(getOption(None, Some("hello"), Some(123)) == Some("hello"))
  }

  test("getOption is invoked on (String, None, Int)") {
    assert(getOption(Some("hello"), None, Some(123)) == Some("hello"))
  }
}
