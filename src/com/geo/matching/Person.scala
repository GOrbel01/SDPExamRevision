package com.geo.matching

/**
  * Created by Cloud on 08/05/2016.
  */
case class Person(firstName: String, lastName: String)

object Stormtrooper {
  def inspect(p: Person): String =
    p match {
      case Person("Luke", "Skywalker") => "Stop, rebel scum!"
      case Person("Han", "Solo") => "You're good!"
      case Person("James", "Blunt") => "You suck man!"
      case Person(firstName, lastName) => s"Move Along $firstName"
    }
}

object Main extends App {
  println(Stormtrooper.inspect(Person("James", "Blunt")))
  println(Stormtrooper.inspect(Person("Han", "Solo")))
}
