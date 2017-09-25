package fr.aberwag.scala.variance

object Main {
  def main(args: Array[String]) {
    var s: Stack[Any] = new Stack().push("hello");
    s = s.push(new Object())
    s = s.push(7)
    println(s)
  }
}