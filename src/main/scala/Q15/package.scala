package object Q15 {
  implicit def seqToSeq[T: Numeric](a: Seq[T]) = new BetterSeq(a)
}
