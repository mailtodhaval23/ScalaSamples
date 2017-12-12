import scala.collection.immutable.Queue
import scala.collection.mutable
import scala.collection.mutable.{LinkedList, ListBuffer}

class BinaryTree {
}
object  BinaryTree  {
  def printInOrder(root: Node):Unit = {
    if(root == null ) return
    printInOrder(root.left)
    print(root.value + ", ")
    printInOrder(root.right)
  }
  def printPreOrder(root: Node):Unit = {
    if(root == null ) return
    print(root.value + ", ")
    printPreOrder(root.left)
    printPreOrder(root.right)
  }
  def levelOrder(root:Node):Unit = {
    if (root == null) return;
    var queue = Queue[Node]()
    queue = queue.enqueue(root)

    while(!queue.isEmpty) {
      val (current, queNode) = queue.dequeue
      queue = queNode
      if (current.left != null) queue = queue.enqueue(current.left)
      if (current.right != null) queue = queue.enqueue(current.right)
      print(current.value + ", ")
    }
  }

  def levelOrderWithNewLine(root:Node):Unit = {
    if (root == null) return;
    var queue = Queue[Node]()
    queue = queue.enqueue(root)
    var levelCount = 1;
    var currentCount = 0

    while (!queue.isEmpty) {
      val (current, queNode) = queue.dequeue
      queue = queNode
      if (current.left != null) {
        queue = queue.enqueue(current.left)
        currentCount = currentCount + 1
      }
      if (current.right != null) {
        queue = queue.enqueue(current.right)
        currentCount = currentCount + 1
      }
      print(current.value + ", ")
      levelCount = levelCount - 1
      if (levelCount == 0) {
        println()
        levelCount = currentCount
        currentCount = 0
      }
    }
  }

  def levelOrderWtihListOfLL(root: Node):List[List[Node]] = {
    var list: ListBuffer[List[Node]] = new ListBuffer[List[Node]]()
    val queue = new mutable.Queue[Node]()
    var currentList = new ListBuffer[Node]()
    queue.enqueue(root)
    var levelCount = 1; var currentCount = 0
    while(!queue.isEmpty){
      val current = queue.dequeue()
      if (current.left != null) {
        queue.enqueue(current.left)
        currentCount = currentCount + 1
      }
      if (current.right != null) {
        queue.enqueue(current.right)
        currentCount = currentCount + 1
      }
      currentList += current
      levelCount = levelCount - 1
      if (levelCount == 0) {
        list += currentList.toList
        levelCount = currentCount
        currentCount = 0
        currentList = new ListBuffer[Node]()
      }
    }
    return list.toList
  }
}