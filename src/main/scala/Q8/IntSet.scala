package Q8

import scala.collection.mutable.ArrayBuffer

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def excl(x: Int): IntSet // Add a method to return the given set without the element x
  def isEmpty: Boolean// implement a test method isEmpty: Boolean for sets
  def toArrayBuffer: ArrayBuffer[Int] // utility method for converting IntSet into ArrayBuffer
  def union(other: IntSet): IntSet // Write method union to form the union between two sets
  def intersection(other: IntSet): IntSet // Write method intersection to form the intersection between two sets
}
