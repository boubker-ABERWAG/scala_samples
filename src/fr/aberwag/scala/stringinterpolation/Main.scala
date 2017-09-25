package fr.aberwag.scala.stringinterpolation

/*
 * Starting in Scala 2.10.0, Scala offers a new mechanism to create strings from your data: String Interpolation.
 * String Interpolation allows users to embed variable references directly in processed string literals
 */
object Main{
    def main(args: Array[String]): Unit ={
        val name = "Wassyl"
        /*
         *  the literal s"Hello, $name" is a processed string literal.
         *  This means that the compiler does some additional work to this literal
         *  Scala provides three string interpolation methods out of the box: s, f and raw
         */
        println(f"Hello , $name ")

        val height = 1.9d
        /*
         * Prepending f to any string literal allows the creation of simple formatted strings, similar to printf in other languages.
         * When using the f interpolator, all variable references should be followed by a printf-style format string, like %d
         */
        println(f"$name%s is $height%2.2f meters tall") // Wassyl is 0.8 meters tall

        /*
         * The raw interpolator is similar to the s interpolator except that it performs no escaping of literals within the string
         */
        println(raw"a\nb") // a\nb
        println(s"a\nb")
        /* result
         * a
         * b
         */
    }

}
