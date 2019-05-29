package Q6

import org.scalatest.FunSuite

class Q6Suite extends FunSuite {
  val input = "the quickest fox jumped over the dog"

  test("longestWord is invoked on a sentence") {
    assert(longestWord(input) == "quickest")
  }

  test("longestWord is invoked on an empty string") {
    assert(longestWord("") == "")
  }

  test("commonWord is invoked on a sentence") {
    assert(commonWord(input) == "the")
  }

  test("commonWord is invoked on an empty string") {
    assert(commonWord("") == "")
  }

  test("commonLetter is invoked on a sentence") {
    assert(commonLetter(input) == 'e')
  }

  test("commonLetter is invoked on an empty string") {
    assert(commonLetter("") == '\0')
  }

  test("mapLetter is invoked on a sentence") {
    val output = Map('e' -> Set("the", "quickest", "jumped", "over"), 'h' -> Set("the"), 'q' -> Set("quickest"), 't' -> Set("the", "quickest"),
      'k' -> Set("quickest"), 'j' -> Set("jumped"), 's' -> Set("quickest"), 'v' -> Set("over"), 'd' -> Set("jumped", "dog"),
      'm' -> Set("jumped"), 'g' -> Set("dog"), 'p' -> Set("jumped"), 'x' -> Set("fox"), 'r' -> Set("over"), 'i' -> Set("quickest"),
      'c' -> Set("quickest"), 'u' -> Set("quickest", "jumped"), 'f' -> Set("fox"), 'o' -> Set("fox", "over", "dog"))
    assert(mapLetter(input) == output)
  }

  test("mapLetter is invoked on an empty string") {
    assert(mapLetter("").isEmpty)
  }
}
