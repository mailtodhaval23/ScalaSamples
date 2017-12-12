import org.scalatest.FlatSpec

class BinaryTreeSpec extends FlatSpec {
  def createSampleTree(): Node = {
    val root = new Node("A")
    root.left = new Node("B")
    root.right = new Node("C")
    root.left.left = new Node("D")
    root.left.right = new Node("E")
    root.right.left = new Node("F")
    root.right.right = new Node("G")
    root.left.left.left = new Node("H")
    root.right.right.right = new Node("I")
    root
  }

  "A BinaryTree" should "print Inorder Traversal" in {
    val root = createSampleTree()
    BinaryTree.printInOrder(root)
  }
  "A BinaryTree" should "print PreOrder Traversal" in {
    val root = createSampleTree()
    BinaryTree.printPreOrder(root)
  }

  "A BinaryTree" should "print LevelOrder Traversal" in {
    val root = createSampleTree()
    BinaryTree.levelOrder(root)
  }
  "A BinaryTree" should "print LevelOrder Traversal with NewLine" in {
    val root = createSampleTree()
    BinaryTree.levelOrderWithNewLine(root)
  }

  "A BinaryTree" should "print LevelOrder Traversal as List" in {
    val root = createSampleTree()
    val out = BinaryTree.levelOrderWtihListOfLL(root)
    println(out)
  }
}