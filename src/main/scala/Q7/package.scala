package object Q7 {
  // Convert a list of strings to a list of all the characters in all the strings
  def stringsToChars(stringList: List[String]) = {
    val s = stringList.mkString("")
    s.toList
  }
}
