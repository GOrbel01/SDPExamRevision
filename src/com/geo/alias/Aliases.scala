package com.geo.alias

/**
  * Created by Cloud on 15/05/2016.
  */
object Aliases extends App {
  type User = String
  type Age = Int

  //Get this
//  Map[String,Int]

  //Can describe as this
  val data: Map[User, Age] = Map.empty

  trait SimpleContainer {
    type A

    def value: A
  }

  case class IntContainer() extends SimpleContainer {
    type A = Int
    def value = 42
  }

  case class StringContainer() extends SimpleContainer {
    type A = String
    def value = "fred"
  }
}
