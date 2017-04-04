package scalapy.tensorflow

import jep.Jep
import py.ObjectFascade

class Training(o: py.Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def ExponentialMovingAverage(decay: Double): ExponentialMovingAverage = native

  def GradientDescentOptimizer(learningRate: Double): Optimizer = native

  def AdamOptimizer(lr: Double): Optimizer = native
}
