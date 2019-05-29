import scala.collection.mutable.Map

package object Q6 {
  // The longest word
  def longestWord(s: String) = {
    if (s.length == 0) ""
    else s.split(" ").maxBy(word => word.length)
  }

  // The most common word
  def commonWord(s: String) = {
    if (s.length == 0) ""
    else {
      val wordFrequency = Map[String, Int]()
      s.split(" ").map(word => wordFrequency(word) = wordFrequency.getOrElse(word, 0) + 1)
      wordFrequency.maxBy(word => word._2)._1
    }
  }

  // The most common letter
  def commonLetter(s: String) = {
    if (s.length == 0) '\0'
    else {
      val letterFrequency = Map[Char, Int]()
      s.toArray.filter(_ != ' ').map(letter => letterFrequency(letter) = letterFrequency.getOrElse(letter, 0) + 1)
      letterFrequency.maxBy(letter => letter._2)._1
    }
  }

  // Create a map from letter to a set of words it appear in
  def mapLetter(s: String) = {
    val letterWordset = Map[Char, Set[String]]()
    if (s.length > 0)
      s.split(" ").map(word => word.toArray.map(letter => letterWordset(letter) = letterWordset.getOrElse(letter, Set[String]()) + word))
    letterWordset
  }
}
