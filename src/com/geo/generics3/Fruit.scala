package com.geo.generics3

/**
  * Created by Cloud on 15/05/2016.
  */
trait Fruit[T <: Fruit[T]] { // <: === extends // >: === super
  final def compareTo(other: Fruit[T]): Boolean = true
}

class Apple() extends Fruit[Apple]
class Orange() extends Fruit[Orange]

object Main extends App {
  val apple = new Apple
  val orange = new Orange
  val bloodredorange = new Orange

  orange compareTo bloodredorange
}