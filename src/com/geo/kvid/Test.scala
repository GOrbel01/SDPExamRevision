package com.geo.kvid

/**
  * Created by Cloud on 08/05/2016.
  */
object Test extends App {
  def meth(s: String, i: Int): (String,Int) = {
    var str = s
    var j = i
    for (x <- 0 until j) {
      str += s
    }
    j = 6
    (str,j)
  }

  println(meth("abc", 4))
}
