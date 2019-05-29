package Q7

import org.scalatest.FunSuite

class StringToCharsSuite extends FunSuite {
  test("stringsToChars is invoked on a list of strings") {
    val input = List("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog")
    val output = List('t', 'h', 'e', 'q', 'u', 'i', 'c', 'k', 'b', 'r', 'o', 'w', 'n', 'f', 'o', 'x', 'j', 'u', 'm', 'p', 's',
      'o', 'v', 'e', 'r', 't', 'h', 'e', 'l', 'a', 'z', 'y', 'd', 'o', 'g')
    assert(stringsToChars(input) == output)
  }

  test("stringToChars is invoked on an empty list") {
    assert(stringsToChars(List[String]()).isEmpty)
  }
}
