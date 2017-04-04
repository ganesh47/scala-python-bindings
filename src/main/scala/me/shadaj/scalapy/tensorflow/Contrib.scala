package me.shadaj.scalapy.tensorflow

import jep.Jep
import py._

class Contrib(o: Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def layers: Layers = native
}
