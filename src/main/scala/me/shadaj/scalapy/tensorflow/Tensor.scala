package me.shadaj.scalapy.tensorflow

import jep.Jep
import py.ObjectFascade

class Tensor(o: py.Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def unary_+(): Tensor = {
    (+dynamic).as[Tensor]
  }

  def unary_-(): Tensor = {
    (-dynamic).as[Tensor]
  }

  def +(that: Tensor): Tensor = {
    (dynamic + that).as[Tensor]
  }

  def -(that: Tensor): Tensor = {
    (dynamic - that).as[Tensor]
  }

  def *(that: Tensor): Tensor = {
    (dynamic * that).as[Tensor]
  }

  def /(that: Tensor): Tensor = {
    (dynamic / that).as[Tensor]
  }
}
