/*
Given a list:List[Int] and map:Map[Int, Double], multiply all the numbers in the list with their corresponding value in the map,
and drop if don't exists
 */
package object Q12 {
  def multiply(l: List[Int], m: Map[Int, Double]) = {
    l.filter(m.contains(_)).map(x => x * m(x))
  }
}
