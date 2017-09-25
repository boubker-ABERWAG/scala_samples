package fr.aberwag.scala.variance

/*
 * Scala supports variance annotations of type parameters of generic classes. 
 * In contrast to Java 5 (aka. JDK 1.5), 
 * variance annotations may be added when a class abstraction is defined, 
 * whereas in Java 5, variance annotations are given by clients when a class abstraction is used.
 * 
 * In the page about generic classes an example for a mutable stack was given.
 * We explained that the type defined by the class Stack[T] is subject to invariant subtyping regarding the type parameter. 
 * This can restrict the reuse of the class abstraction. We now derive a functional (i.e. immutable) implementation for stacks which does not have this restriction. 
 * Please note that this is an advanced example which combines the use of polymorphic methods, lower type bounds, and covariant type parameter annotations in a non-trivial fashion. 
 * Furthermore we make use of inner classes to chain the stack elements without explicit links.
 * 
 */

class Stack[+A] {
  def push[B >: A](elem: B): Stack[B] = new Stack[B] {
    override def top: B = elem
    //override def pop: Stack[B] = Stack.this
    override def toString() = elem.toString() + " " +
      Stack.this.toString()
  }
  def top: A = sys.error("no element on stack")
  def pop: Stack[A] = sys.error("no element on stack")
  override def toString() = ""
}