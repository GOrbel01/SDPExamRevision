package com.geo.algpat

//HAS-A OR Pattern
//A HAS-A B or a C
trait AAAA {
  def d: D
}
sealed trait D
final case class BBBB() extends D
final case class CCCC() extends D

sealed trait AAAAA
final case class DDDD(b: B) extends AAAAA
final case class EEEE(c: C) extends AAAAA
