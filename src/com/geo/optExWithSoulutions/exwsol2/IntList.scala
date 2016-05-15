package com.geo.optExWithSoulutions.exwsol2

/**
  * Created by Cloud on 15/05/2016.
  */
trait IntList {

//  def length: Int =
//    this match {
//      case End => 0
//      case Pair(hd, tl) => 1 + tl.length
//    }
//
//  def product: Int =
//    this match {
//      case End => 1
//      case Pair(hd, tl) => hd * tl.product
//    }
//
//  def sum: Int =
//    this match {
//      case End => 1
//      case Pair(hd, tl) => hd + tl.sum
//    }

  def length: Int = fold[Int](0, (_, v) => 1 + v)

  def product: Int = fold[Int](1, (n, v) => n * v)

  def sum: Int = fold[Int](1, (n, v) => n + v)

//  def double: IntList =
//    this match {
//      case End => End
//      case Pair(hd, tl) => Pair(hd * 2, tl.double)
//    }

  def double: IntList = fold[IntList](End, (n, ls) => Pair(n * 2, ls) )

//  def fold(end: Int, f: (Int, Int) => Int): Int =
//    this match {
//      case End => end
//      case Pair(hd, tl) => f(hd, tl.fold(end, f))
//    }

  def fold[A](end: A, f: (Int, A) => A): A =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

object TestIntList extends App {
  val ll = Pair(1, Pair(2, Pair(3, Pair(6, End))))

  println(ll.length)
  println(ll.double)
}