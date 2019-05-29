package Q5

// Write a clause that measures the run time of a block of code and prints it (also needs to return the original output of the block)
object timeit {
  def apply[A](callback: => A) = {
    val startTime = System.currentTimeMillis
    val output = callback
    println(System.currentTimeMillis - startTime + " nanoseconds")
    output
  }
}