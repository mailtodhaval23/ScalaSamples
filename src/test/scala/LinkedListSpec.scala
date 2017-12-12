import org.scalatest.FlatSpec
import io.dystems.ds.LinkedList

class LinkedListSpec extends FlatSpec {

  def createLinkedList():LinkedList[String] = {
    val linkedList = new LinkedList[String]()
    linkedList.add("A")
    linkedList.add("B")
    linkedList.add("C")
    linkedList.add("D")
    linkedList.add("E")
    linkedList.add("F")
    linkedList
  }


  "A Linked List" should "print Inorder Traversal" in {
    val ll = createLinkedList()
    ll.print()
  }

  "A Linked List" should "reverse LinkedList" in {
    val ll = createLinkedList()
    ll.reverse()
    ll.print()
    val ll2 = new LinkedList[String]
    ll2.reverse()
    ll2.print()

  }

}