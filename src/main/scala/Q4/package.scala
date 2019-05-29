import scala.math.abs

package object Q4 {
  // Implement GCD in Scala (hint: use pattern matching and tail recursion)
  @annotation.tailrec
  def GCD(a: Int, b: Int) : Int = (abs(a), abs(b)) match {
    case (a, 0) => a
    case (a, b) =>
      val t = b
      GCD(t, a % b)
  }
}
