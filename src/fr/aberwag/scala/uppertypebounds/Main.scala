package fr.aberwag.scala.uppertypebounds

object Main {

  def main(args: Array[String]) {
    var dogCage = new Cage[Dog](new Dog)
    var catCage = new Cage[Cat](new Cat)
    /* Cannot put Lion in a cage as Lion is not a Pet. */
    //var lionCage = new Cage[Lion](new Lion)
    
  }
}