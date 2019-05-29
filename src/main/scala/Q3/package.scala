package object Q3 {
  implicit def doubleToDouble(d: Double) = new BetterDouble(d)
}
