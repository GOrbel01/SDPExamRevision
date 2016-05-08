package com.geo.algpat
//AA IS-A BB or CC

// Feline is a Cat or a Lion or a Tiger

//Sum Type Pattern
trait SumType

sealed trait AA
final case class BB() extends AA
final case class CC() extends AA