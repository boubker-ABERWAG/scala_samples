package fr.aberwag.scala.magic

object Main {
  def main(args: Array[String]): Unit = {
    var p: Person = Factory("ABERWAG", "Wassyl", 19)
    // var p: Person = Factory.apply("ABERWAG", "Wassyl", 19)
    var p1: Person = Factory.createPerson("Was", "ABER", 19)
    p.affichage
    p1.affichage
  }
}