package Q3

import language.implicitConversions

// Write the ~= operator for comparing doubles. The operator should return true iff 2 doubles are equal up to a small constant
class BetterDouble(val d: Double) {
  def ~=(other: Double)(implicit constant: Double = 0.000001) = Math.abs(d-other) <= constant
}
