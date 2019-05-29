import scala.math.{abs, sqrt}

// Consider a function which squares all elements of a list and returns a list with the results.
// Complete the following two equivalent definitions of squareList.
package object Q10 {
  val max = sqrt(Int.MaxValue).toInt

  def squareList(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys =>
      require(abs(y) <= max && y != Int.MinValue, "element must be between -" + max + " and " + max)
      y * y :: squareList(ys)
  }

  def squareMapList(xs: List[Int]): List[Int] = {
    xs.map(x => require(abs(x) <= max && x != Int.MinValue, "element must be between -" + max + " and " + max))
    xs.map(x => x * x)
  }
}
