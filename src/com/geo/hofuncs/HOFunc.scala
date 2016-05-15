package com.geo.hofuncs

/**
  * Created by Cloud on 09/05/2016.
  */
object HOFunc extends App {
  val lst = List(1.0, 2.0, 3.0, 4.0)

  println(lst.map(n => n * n))
  println(lst.reduce((n1, n2) => n1 + n2))
  println(lst.fold(0.0)((n1, n2) => n1 + n2))
  println(lst.foldLeft(1.0)((n1,n2) => n1 / n2))
  println(lst.foldRight(1.0)((n1,n2) => n1 / n2))

  val clst = lst.map(f => List(f, -f))
  println(clst)
  println(clst.flatten)
  println("FM...")
  println(lst.flatMap(f => List(f, -f)))

  val blst = lst :: List(5, 6, 7)
  println(blst.flatMap(x => List(x)))
  println(blst)
}
