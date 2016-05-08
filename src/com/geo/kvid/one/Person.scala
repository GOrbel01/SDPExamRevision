package com.geo.kvid.one

/**
  * Created by Cloud on 08/05/2016.
  */
class Person(first: String, last: String) {
  val firstName = first
  val lastName = last

  def name = s"${firstName} ${lastName}"

  override def toString() = s"$firstName $lastName"
}

object Main extends App {
  val p = new PersonVal("Boris", "Dodge")
  println(p)
  println(p.name)

  println("Four...\n")

  val p4 = new PersonFour(lastName = "David", firstName = "Dodge")
  println(p4.greet())
  println(p4.greet("Max", "Hole"))
  println(p4.greet("James"))
  println(p4.greet(lastName = "Murdoch"))
}

class PersonVal(val firstName: String, val lastName: String) {
  def name = s"${firstName} ${lastName}"
}

class PersonFour(val firstName: String, val lastName: String) {
  def greet(firstName: String = "Steve", lastName: String = "Strange") =
    s"Greetings ${firstName} $lastName"
}