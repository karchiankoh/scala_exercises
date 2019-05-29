package Q15

import math._

// Add a method "median" to a Seq of integers so that s.median is the median of s for s of type Seq[Int]
// How can you add the same method for a sequence of doubles with minimal code duplication?
class BetterSeq[T: Numeric](val a: Seq[T]) {
  def median: Double = {
    val sorted = a.sorted
    val len = sorted.length
    if (len == 0) 0
    else if (len % 2 == 1) implicitly[Numeric[T]].toDouble(sorted(len / 2))
    else (implicitly[Numeric[T]].toDouble(sorted(len / 2 - 1)) + implicitly[Numeric[T]].toDouble(sorted(len / 2))) / 2
  }
}