package com.geo.ex1

/**
  * Created by Cloud on 11/05/2016.
  */
sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
  def colour: Colour
}

sealed trait Colour {
  def red: Double
  def green: Double
  def blue: Double

  def light(): Boolean = (blue * 2) + red + green > 2.0
  def dark(): Boolean = !light()
}

case object Red extends Colour {
  val red = 1.0
  val green = 0.0
  val blue = 0.0
}

case object Yellow extends Colour {
  val red = 1.0
  val green = 1.0
  val blue = 0.0
}

case object Pink extends Colour {
  val red = 0.5
  val green = 0.0
  val blue = 0.5
}

case class CustomColour(red: Double, green: Double, blue: Double) extends Colour {}

abstract class Rectangular extends Shape {
  def width: Double
  def height: Double
  def colour: Colour
}

case class Circle(radius: Double, colour: Colour) extends Shape {
  val this.colour = colour
  override def sides = 0
  override def perimeter = (2 * Math.PI) * radius
  override def area = Math.PI * (radius * radius)
}

case class Square(width: Double, colour: Colour) extends Rectangular {
  val this.colour = colour
  override def height = width
  override def sides = 4
  override def perimeter = 4 * width
  override def area = width * height
}

case class Rectangle(width: Double, height: Double, colour: Colour) extends Rectangular {
  val this.colour = colour
  override def sides = 4
  override def perimeter = (2 * width) + (2 * height)
  override def area = width * height
}

object Draw {
  def apply(shape: Shape): String = shape match {
    case shape: Circle => "A " + getColour(shape.colour) + " circle with a radius of " + shape.radius + " and an area of " + shape.area
    case shape: Square => "A " + getColour(shape.colour) + " square with a length of " + shape.width + " and an area of " + shape.area
    case shape: Rectangle => "A " + getColour(shape.colour) + " rectangle with a length of " + shape.width + ", height of " + shape.height + " and an area of " + shape.area
    case _ => "Some Error has Occured"
  }

  def getColour(colour: Colour): String = {
    colour match {
      case Red => "Red"
      case Yellow => "Yellow"
      case Pink => "Pink"
      case col: Colour => if (col.light()) "Light coloured" else "Dark coloured";
      case _ => "Something has gone wrong"
    }
  }
}

object TestIn extends App {
  println(Draw(Square(4, Red)))
  println(Draw(Square(4, CustomColour(0.6,0.5,0.4))))
  println(Draw(Rectangle(7, 5, CustomColour(0.3, 0.2, 0.5))))
  println(Draw(Circle(3, CustomColour(0.5, 0.5, 0.6))))
  println(Draw(Circle(4, Yellow)))
}