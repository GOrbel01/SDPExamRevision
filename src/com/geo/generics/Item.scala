package com.geo.generics

/**
  * Created by Cloud on 15/05/2016.
  */
trait Item

trait PlasticItem extends Item

trait PlasticBottle extends PlasticItem

trait PaperItem extends Item

trait Newspaper extends PaperItem

class TrashCan[T] {
  //Ignore Impl
}

object ItemMain extends App {
  def setTrashCanForPlastic(gc: TrashCan[PlasticItem]): Unit = {

  }

  //Contravariant subtyping
  //setTrashCanForPlastic(new TrashCan[Item])

  //Invariant
  setTrashCanForPlastic(new TrashCan[PlasticItem])

  //Covariant
  //setTrashCanForPlastic(new TrashCan[PlasticBottle])
}