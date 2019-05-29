package Q8

import scala.collection.mutable.ArrayBuffer

class NonEmptySet(private var elem: Int, private var left: IntSet, private var right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  def excl(x: Int): IntSet = {
    if (x < elem) new NonEmptySet(elem, left excl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right excl x)
    else left union right
  }

  def isEmpty: Boolean = false

  def toArrayBuffer(): ArrayBuffer[Int] = toArrayBuffer(this)

  private def toArrayBuffer(x: IntSet): ArrayBuffer[Int] = x match{
    case e: EmptySet => ArrayBuffer[Int]()
    case n: NonEmptySet => toArrayBuffer(n.left) ++ ArrayBuffer(n.elem) ++ toArrayBuffer(n.right)
  }

  def union(other: IntSet): IntSet = other match {
    case e: EmptySet => this
    case n: NonEmptySet => incl(n.elem).union(n.left).union(n.right)
  }

  def intersection(other: IntSet): IntSet = other match {
    case e: EmptySet => new EmptySet
    case n: NonEmptySet =>
      if (!contains(n.elem)) intersection(n.left).union(intersection(n.right))
      else intersection(n.left).union(intersection(n.right)).incl(n.elem)
  }
}
