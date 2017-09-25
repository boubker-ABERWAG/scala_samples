package fr.aberwag.scala.magic

object Factory {
  def apply(lastName: String, firstName: String, age: Int) =
    {
      var p: Person = new Person("ABER", "Was");
      p.lastName = lastName;
      p.firstName = firstName
      p.age = age;
      p;
    }
  def createPerson(lastName: String, firstName: String, age: Int) =
    {
      new Person(lastName, firstName, age)
    }
}