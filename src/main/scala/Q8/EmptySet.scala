package Q8

import scala.collection.mutable.ArrayBuffer

class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def excl(x: Int): IntSet = new EmptySet
  def isEmpty: Boolean = true
  def toArrayBuffer: ArrayBuffer[Int] = ArrayBuffer[Int]()
  def union(other: IntSet): IntSet = other match {
    case e: EmptySet => new EmptySet
    case n: NonEmptySet => n.union(this)
  }
  def intersection(other: IntSet): IntSet = new EmptySet
}
