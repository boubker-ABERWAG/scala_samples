package fr.aberwag.scala

object Main{
    var factor = 3

    val multiplier = (i: Int) => i * factor

    def main(args: Array[String]){

        var i: String = "variable"
        val j: java.lang.String = "val"

        println("i => " + i)
        println("j => " + j)
        println("test")

        println("##################################################")
        /*
         * (i: Int, j: Int) => i + j is an anonymous function
         */
        val a = (i: Int, j: Int) => i + j
        val b = (l: Int) => l + a(l, l)

        println("a ====> " + a(20, 20))
        println("a ====> " + b(10))

        println("##################################################")

        println("multiplier(1) value = " + multiplier(1))
        println("multiplier(2) value = " + multiplier(2))

        println("##################################################")

        println("##################################################")

        def exec(f: (String) => Unit, name: String){
            f(name)
        }

        var hello = "Hello"

        def sayHello(name: String){
            println(s"$hello, $name")
        }

        // execute sayHello from the exec method foo
        exec(sayHello, "Al")

        // change the local variable 'hello', then execute sayHello from
        // the exec method of foo, and see what happens
        hello = "Hola"
        exec(sayHello, "Lorenzo")

        println(fact(0));
        def factoriel(n: Int) = (1 to n).foldLeft(1) {
            _ * _
        };

        println(factoriel(10));

        val const = 10;
        println("test")
        println("val const ==> " + const);

        //    const = 20 ;

        testMethode("var1", "var2", "var3", "var4", "var5")

    }

    def fact(n: Int): Int = n match {
        case 0 => 1
        case a => a * fact(a - 1)
    }

    /*
     * String* is like varargs in java.
     */
    def testMethode(i: String*) ={
        i.map(l => print(l + " "))
    }
}