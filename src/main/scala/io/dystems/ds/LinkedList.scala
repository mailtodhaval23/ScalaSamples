package io.dystems.ds

/**
  * Created by dhavalpatel on 12/8/17.
  */
class Node[T](val value:T, var next:Node[T])
class LinkedList[T]() {
  var first:Node[T] = null
  var last:Node[T] = null

  def add(t:T) = {
    if (first == null) {
      first = new Node(t, null)
      last = first
    } else {
      var current = first
      while(current.next != null){
        current = current.next
      }
      current.next = new Node(t, null)
      last = current
    }
  }

  def reverse() = {
    var t = first
    //first.next = null
    var prev:Node[T] = null
    while(t != null){
      var next = t.next
      t.next = prev
      prev = t
      t = next
    }
    first = prev
  }
  def print() = {
    var current = first
    while (current != null) {
      scala.Predef.print(current.value.toString + " -> ")
      current = current.next
    }
    println("null")
  }
}
