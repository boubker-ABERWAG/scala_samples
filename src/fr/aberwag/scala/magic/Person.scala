package fr.aberwag.scala.magic

class Person(_lastName: String, _firstName: String) {
  var lastName: String = _lastName;
  var firstName: String = _firstName;
  var age: Int = 100;
  def affichage: Unit = println(firstName + " " + lastName + " à " + age + " mois ");

  def this(__firstName: String, __lastName: String, age: Int) = {
    this(__lastName, __firstName);
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age
  }
}