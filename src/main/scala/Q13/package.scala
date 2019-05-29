/*
Write a retry method that converts a method to a retry-able method.
However, you also need some way to specify how many times to retry and support sleep between retries (hint: implicit arguments)
 */
package object Q13 {
  def retry(callback: => Any)(implicit retries: Int = 1, sleepTime: Int = 500) : Unit = {

    try {
      callback
    } catch {
      case e: Exception =>
        if (retries > 0) {
          Thread.sleep(sleepTime)
          retry(callback)(retries - 1, sleepTime)
        }
    }
  }
}
