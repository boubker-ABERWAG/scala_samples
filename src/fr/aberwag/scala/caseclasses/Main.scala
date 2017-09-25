package fr.aberwag.scala.caseclasses

object Main {
  def main(args: Array[String]) {
    /*
     * Instantiating a case class is easy: (Note that we don’t need to use the new keyword)
     */
    val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!")
    println("#############################################################################################")

    /*
     * The constructor parameters of case classes are treated as public values and can be accessed directly.
     */
    val title = emailFromJohn.title
    println(title) // prints "Greetings From John!"
    println("#############################################################################################")

    /*
     * With case classes, you cannot mutate their fields directly. 
     * (unless you insert var before a field, but doing so is generally discouraged).
     */
    // emailFromJohn.title = "Goodbye From John!" 
    //This is a compilation error. We cannot assign another value to val fields, which all case classes fields are by default.
    println("#############################################################################################")

    /*
     * Instead, you make a copy using the copy method. As seen below, you can replace just some of the fields:
     */
    val editedEmail = emailFromJohn.copy(title = "I am learning Scala!", body = "It's so cool!")
    println(emailFromJohn) // prints "Email(john.doe@mail.com,Greetings From John!,Hello World!)"
    println(editedEmail) // prints "Email(john.doe@mail.com,I am learning Scala,It's so cool!)"
    println("#############################################################################################")

    /*
     * For every case class the Scala compiler generates an equals method which implements structural equality and a toString method. For instance:
     */
    val firstSms = Sms("12345", "Hello!")
    val secondSms = Sms("12345", "Hello!")
    if (firstSms == secondSms) {
      println("They are equal!")
    }
    println("Sms is: " + firstSms)
    println("#############################################################################################")

    /*
     * With case classes, you can utilize pattern matching to work with your data. 
     * Here’s a function that prints out different messages depending on what type of Notification is received:
     */
    def showNotification(notification: Notification): String = {
      notification match {
        case Email(email, title, _) =>
          "You got an email from " + email + " with title: " + title
        case Sms(number, message) =>
          "You got an Sms from " + number + "! Message: " + message
      }
    }
    val someSms = Sms("12345", "Are you there?")
    println(showNotification(someSms))
    println("#############################################################################################")

    /*
     * Here’s a more involved example using if guards. 
     * With the if guard, the pattern match branch will fail if the condition in the guard returns false.
     */
    def showNotificationSpecial(notification: Notification, specialEmail: String, specialNumber: String): String = {
      notification match {
        case Email(email, _, _) if email == specialEmail =>
          "You got an email from special someone!"
        case Sms(number, _) if number == specialNumber =>
          "You got an Sms from special someone!"
        case other =>
          showNotification(other) // nothing special, delegate to our original showNotification function   
      }
    }
    val SPECIAL_NUMBER = "55555"
    val SPECIAL_EMAIL = "jane@mail.com"
    val sms = Sms("12345", "Are you there?")
    val specialEmail = Email("jane@mail.com", "Drinks tonight?", "I'm free after 5!")
    val specialSms = Sms("55555", "I'm here! Where are you?")
    println(showNotificationSpecial(sms, SPECIAL_EMAIL, SPECIAL_NUMBER))
    println(showNotificationSpecial(specialEmail, SPECIAL_EMAIL, SPECIAL_NUMBER))
    println(showNotificationSpecial(specialSms, SPECIAL_EMAIL, SPECIAL_NUMBER))

  }
}