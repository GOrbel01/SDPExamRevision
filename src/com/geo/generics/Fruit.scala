package com.geo.generics

/**
  * Created by Cloud on 15/05/2016.
  */
trait Fruit

case class Apple() extends Fruit
case class Orange() extends Fruit



object Main extends App {
  val l1: List[Apple] = Apple() :: Nil
  val l2: List[Fruit] = Orange() :: l1
  //List is defined as [+T] which makes it covariant
  //[-T] Contravariant
}
