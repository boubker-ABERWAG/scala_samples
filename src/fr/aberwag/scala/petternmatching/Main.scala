package fr.aberwag.scala.petternmatching

object Main {
  def main(args: Array[String]): Unit = {
    /*
     * Scala has a built-in general pattern matching mechanism
     * It allows to match on any sort of data with a first-match policy.
     * Here is a small example which shows how to match against an integer value:
     */
    def matchIntStringTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
    println(matchIntStringTest(2))

    /*
     * The block with the case statements defines a function which maps integers to strings.
     * The match keyword provides a convenient way of applying a function (like the pattern matching function above) to an object.
     * Here is a second example which matches a value against patterns of different types:
     */
    def matchStringIntTest(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
    }
    println(matchStringIntTest("two"))
  }
  /*
   * The first case matches if x refers to the integer value 1.
   * The second case matches if x is equal to the string "two".
   * The third case consists of a typed pattern;
   * it matches against any integer and binds the selector value x to the variable y of type integer.
   *
   * Scala’s pattern matching statement is most useful for matching on algebraic types expressed via case classes.
   * Scala also allows the definition of patterns independently of case classes, using unapply methods in extractor objects.
   */
}