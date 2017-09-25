package fr.aberwag.scala.nestedfunctions

object Main {
  def main(args: Array[String]): Unit = {
    /*
     * In Scala it is possible to nest function definitions.
     * The following object provides a filter function for extracting values from a list of integers
     * that are below a threshold value:
     */
    def filter(xs: List[Int], threshold: Int) = {
      def process(ys: List[Int]): List[Int] =
        if (ys.isEmpty) ys
        else if (ys.head < threshold) ys.head :: process(ys.tail)
        else process(ys.tail)
      process(xs)
    }
    println(filter(List(1, 9, 2, 8, 3, 7, 4), 5))

    /*
     * Note: the nested function process refers to variable threshold defined in the outer scope as a parameter value of filter.
     */
  }
}