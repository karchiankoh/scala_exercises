package Q14

import scala.math.{abs, sqrt}

/*
Design a class that is given a vector of numbers in the constructor
nothing should be calculated in the constructor of the class assume the calculation of x,y,z can take a lot of time,
and should only be done once (at most)
*/
class NumberVector(nums: Vector[Long]) {
  val max = sqrt(Int.MaxValue).toInt
  nums.map(x => require(abs(x) <= max && x != Int.MinValue, "element must be between -" + max + " and " + max))
  // x: a vector with the square of all elements in the input vector
  lazy val x = nums.map(x => x * x)
  // y: the sum of x
  lazy val y = x.sum
  // z: the square root of y
  lazy val z = sqrt(y)
}
