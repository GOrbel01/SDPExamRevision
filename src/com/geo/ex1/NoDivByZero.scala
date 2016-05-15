package com.geo.ex1

/**
  * Created by Cloud on 13/05/2016.
  */
object NoDivByZero extends App {
  println(divide(4, 2))
  println(divide(4, 0))

  println(runDivide(20, 4))
  println(runDivide(14, 0))

  def runDivide(numOne: Int, numTwo: Int): String = {
    val result = divide(numOne, numTwo)
    result match {
      case res: Finite => "Valid Division as Denominator is " + numTwo + " not zero."
      case Infinite => "Attempted to Divide by Zero, this results in Infinite division"
      case _ => "You shouldnt be here..."
    }
  }
}

sealed trait DivisionResult {}

case class Finite(res: Int) extends DivisionResult

case object Infinite extends DivisionResult

object divide {
  def apply(numOne: Int, numTwo: Int): DivisionResult = {
    if (numTwo == 0) Infinite else Finite(numOne / numTwo)
  }
}