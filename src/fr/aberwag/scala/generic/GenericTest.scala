package fr.aberwag.scala.generic

class GenericTest[T] {
      var elems: List[T] = Nil
  def push(x: T) { elems = x :: elems }
  def top: T = elems.head
  def pop() { elems = elems.tail }
}