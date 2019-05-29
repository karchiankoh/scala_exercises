package Q2

// use a trait to modify the behavior of 'put' so it reverses each string before adding it to the queue
trait ReverseStrings {
  def put(s: String) = s.reverse
}
