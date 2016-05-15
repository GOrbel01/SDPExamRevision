package com.geo.ex1

/**
  * Created by Cloud on 11/05/2016.
  */
object Main extends App {
  //V1 Ops
  val v1 = Vector(1, 2, 3, 4)
  val v2 = Vector(1, 10, 100, 1000)

  println(v1.map(n => (n * 11) + 10))
  println(v1.foreach(n => println((n * 11) + 10)))

  println(for (e <- v1) yield (e * 11) + 10)
  println(for (e <- v1) yield e + 1)

  println()
  //Onto V2 ops
  println(v2.reduce((sum, n) => sum + n))
  var count = 0
  for (n <- v2.indices) {
    count = count + v2(n)
  }
  println(count)

  println(sumIt(45, 45, 45, 60))

  def sumIt(arg: Int*) = {
    arg.reduce((sum, n) => sum + n)
  }
}
