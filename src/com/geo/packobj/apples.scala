package com.geo.packobj

/**
  * Created by Cloud on 15/05/2016.
  */
package object apples extends RedApples with GreenApples {
  val redApples = List(red1, red2, red3)
  val greenApples = List(green1, green2)
}

trait RedApples {
  val red1 = "So Red"; val red2 = "Somewhat Red"; val red3 = "A bit Red"
}

trait GreenApples {
  val green1, green2 = "green"
}
