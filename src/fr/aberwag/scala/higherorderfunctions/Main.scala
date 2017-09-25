package fr.aberwag.scala.higherorderfunctions

object Main {
  def main(args: Array[String]) {

    /*
     * Scala allows the definition of higher-order functions.
     * These are functions that take other functions as parameters, or whose result is a function.
     * Here is a function apply which takes another function f and a value v and applies function f to v:
     */
    def apply(f: Int => String, v: Int) = f(v)

  }
}