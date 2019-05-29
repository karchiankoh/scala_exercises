package object Q11 {
  // Write a function that gets an optional x,y and z and returns the first that is not None
  def getOption(options: Option[Any]*) = {
    options.find(_.isDefined).getOrElse(None)
  }
}
