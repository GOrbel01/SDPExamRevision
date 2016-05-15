package com.geo.generics2

/**
  * Created by Cloud on 15/05/2016.
  */
trait Fruit {
  final def compareTo(other: Fruit): Boolean = true
}

case class Apple() extends Fruit

case class Orange() extends Fruit

object MyMain extends App {
  val apple = new Apple()
  val orange = new Orange()

  apple compareTo orange //Compiles but we want to make comparisons for same fruit
}
