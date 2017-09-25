package fr.aberwag.scala.generic

object Main {
  def main(args: Array[String]) {
    val stack = new GenericTest[Int]
    stack.push(1)
    stack.push('a')
    println(stack.top)
    stack.pop()
    println(stack.top)

  }
}