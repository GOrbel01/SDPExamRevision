package com.geo.hofuncs

/**
  * Created by Cloud on 10/05/2016.
  */
sealed trait MOption[+E] {
  def isDefined : Boolean

  def map[R](f : (E) => R) : Option[R]
  def flatMap[R]( f : E => Option[R] ) : Option[R] = if ( isDefined ) f(this.get) else None
  def foreach[U]( f : (E) => U )
  def get() : E
  def getOrElse[B >: E]( f : => B ) : B = if ( isDefined ) get() else f
}

case class MSome[+E](node: E) extends MOption[E] {
  override val isDefined = true
  override def map[R](f : (E) => R) : Option[R] = Some(f(node))
  override def foreach[U]( f : (E) => U ) = f(node)
  override def get() : E = node
}

case object MNone extends MOption[Nothing] {
  override val isDefined = false
  override def map[R](f : (Nothing) => R) : Option[R] = None
  override def foreach[U]( f : (Nothing) => U ) = {}
  override def get() : Nothing = throw new NoSuchElementException("There is no object here, this is a None")
}