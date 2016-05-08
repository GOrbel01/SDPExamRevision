package com.geo.kvid.caseclass

/**
  * Created by Cloud on 08/05/2016.
  */
case class Person(firstName: String, lastName: String = "Person")

object Main extends App {
  val p = new Person("Fred", "Jones")
  println(p)
  val q = Person("Mario", "Kart")
  println(q)
  println(Person("Mike"))
}
