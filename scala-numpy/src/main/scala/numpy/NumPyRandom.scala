package numpy

import jep.Jep
import py._

class NumPyRandom(o: Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def randn(size: Int): NDArray[Double] = {
    dynamic.randn(size).as[NDArray[Double]]
  }

  def rand(size: Int): NDArray[Double] = {
    dynamic.rand(size).as[NDArray[Double]]
  }
}
