package Q9

abstract class IntTree {
  // Complete the following implementations of function contains and insert for IntTree
  def contains(v: Int): Boolean = contains(this, v)

  private def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case n: Node =>
      if (v < n.elem) contains(n.left, v)
      else if (v > n.elem) contains(n.right, v)
      else true
  }

  def insert(v: Int): IntTree = insert(this, v)

  private def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case n: Node =>
      if (v < n.elem) Node(n.elem, insert(n.left, v), n.right)
      else if (v > n.elem) Node(n.elem, n.left, insert(n.right, v))
      else Node(v, n.left, n.right)
  }
}