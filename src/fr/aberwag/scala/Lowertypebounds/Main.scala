package fr.aberwag.scala.Lowertypebounds

object Main {
  def main(args: Array[String]) {
    val empty: ListNode[Null] = ListNode(null, null)
    val strList: ListNode[String] = empty.prepend("hello")
      .prepend("world")
    val anyList: ListNode[Any] = strList.prepend(12345)
    
    println(anyList)
  }
}