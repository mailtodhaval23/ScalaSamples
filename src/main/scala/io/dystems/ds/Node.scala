class Node ( val value: String, var left: Node = null, var right:Node = null){

  override def toString: String = {return ":" + value + ":"}
}