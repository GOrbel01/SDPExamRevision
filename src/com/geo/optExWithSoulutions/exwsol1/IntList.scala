package com.geo.optExWithSoulutions.exwsol1

/**
  * Created by Cloud on 15/05/2016.
  */

sealed trait Result[A]
case class Success[A](result: A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]

sealed trait LinkedList[A] {
  def length(): Int = this match {
    case Pair(hd, tl) => 1 + tl.length
    case End() => 0
  }

  def contains(element: A): Boolean = this match {
    case Pair(hd, tl) => if (hd == element) true else tl.contains(element)
    case End() => false
  }

  def apply(n: Int, c: Int = 0): Result[A] = this match {
    case Pair(hd, tl) => if (c == n) Success(hd) else tl(n, c + 1)
    case End() => Failure("Attempted to get element from an Empty list")
  }

  def apply(n: Int): Result[A] = this match {
    case Pair(hd, tl) => if (n == 0) Success(hd) else tl(n-1)
    case End() => Failure("Index out of bounds")
  }
}

final case class End[A]() extends LinkedList[A]
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object TestExSol extends App {
  val ll = Pair(1, Pair(2, Pair(3, End())))
  println(ll.length())
  println(ll.contains(2))
  println(ll.contains(7))

  println(ll(2))
  println(ll(4))
  println(ll(4, 0))
}