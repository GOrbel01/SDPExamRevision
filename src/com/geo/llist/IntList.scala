package com.geo.llist

import scala.annotation.tailrec

/**
  * Created by Cloud on 08/05/2016.
  */
sealed trait IntList
final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

sealed trait MList
final case object MEnd extends MList
final case class MPair[A](head: A, tail: MList) extends MList

object MyOtherMain extends App {
  val b: MList = MPair("Awesome", MPair("Good",MPair("Bad",MPair("Average",MEnd))))
  val c: MList = MPair(1, MPair(2, MPair(3, MEnd)))

  def concatenate(list: MList): String =
    list match {
      case MEnd => ""
      case MPair(hd,tl) => hd + concatenate(tl)
    }

  def concatenatetr(list: MList, rev: Boolean = false): String = {
    @tailrec
    def conchelper(list: MList, cur: String = ""): String =
      list match {
        case MEnd => println(cur); cur
        case MPair(hd, tl) => println(cur)
          if (rev) {
            if (cur.length() <= 0) conchelper(tl,hd + cur) else conchelper(tl,hd + ", " + cur)
          } else {
            if (cur.length() <= 0) conchelper(tl,cur + hd) else conchelper(tl,cur + ", " + hd)
          }
      }
    conchelper(list)
  }
  println(concatenate(b))
  println(concatenate(c))
  println(concatenatetr(c))
  println(concatenatetr(b))
  println(concatenatetr(b, rev = true))
}

object MyMain extends App {

  Pair(1, Pair(2, Pair(3, End)))

  val d = End
  val c = Pair(3, d)
  val b = Pair(2, c)
  val a = Pair(1, b)

  def sum(list: IntList): Int =
    list match {
      case End => 0
      case Pair(hd, tl) => hd + sum(tl)
    }

  def sumtr(list: IntList): Int = {
    @tailrec
    def sumHelp(list: IntList, total: Int = 0): Int =
      list match {
        case End => total
        case Pair(hd, tl) => sumHelp(tl, total + hd)
      }
    sumHelp(list)
  }

  println(sumtr(a))
  println(sum(a))
}