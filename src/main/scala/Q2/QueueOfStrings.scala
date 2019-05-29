package Q2

// Use a trait to define a generic queue of strings with 'put' and 'get' methods
trait QueueOfStrings {
  def put(s: String): String
  def get: String
}
