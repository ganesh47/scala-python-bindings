package scalapy.tensorflow

import jep.Jep

import py.ObjectFascade

class ExponentialMovingAverage(o: py.Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def apply(vars: Seq[Tensor]): Operation = native

  def average(v: Variable): Variable = native
}
