package com.geo.algpat
//A HAS-A B and C
//A has a B with type B and a C with type C
//class A
/**
  * Created by Cloud on 08/05/2016.
  */
//Product Type Pattern
trait ProductType

trait B
trait C

trait A {
  def b: B
  def c: C
}

//case class B()
//case class C()
//case class A(b: B, c: C)