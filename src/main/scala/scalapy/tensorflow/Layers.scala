package scalapy.tensorflow

import jep.Jep
import py.py.NoneOr
import py.{ObjectFascade, PyFunction}

class Layers(o: py.Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def batch_norm(inputs: Tensor, decay: Double, center: Boolean, scale: Boolean, epsilon: Double,
                 activation_fn: NoneOr[PyFunction], updates_collections: NoneOr[py.Object],
                 is_training: Boolean, reuse: NoneOr[Boolean], scope: NoneOr[String]): Tensor = nativeNamed
}
