package numpytest

import java.lang.management.ManagementFactory

import numpy.NumPy
import org.scalatest.{FlatSpec, Matchers}
import py.py
import utils.EnvIndependentUtils._

/**
  * Created by Ganesh on 4/14/2017.
  */
class NumpyNDArrayTests extends FlatSpec with Matchers {

  "NDArrayTest" should " work " in {
    println(ManagementFactory.getRuntimeMXBean().getName().split("@")(0))
    println("shuhu")
    implicit val jep = setup
    val sys = py.module("sys")
    sys.argv = Array("jep")
    sys.path.insert(0, "./src/main/python")
    println(sys.version)
    val np = py.module("numpy").as[NumPy]
    val matOne = Seq(Seq(1.2, 2.3), Seq(1.1, 2.2))
    val matTwo = Seq(Seq(1.2, 2.3), Seq(1.1, 2.2))
    val first = np.array(matOne)
    val second = np.array(matTwo)
    assert(first.toList.containsSlice(matOne))
    assert(np.shape(first).containsSlice(Seq(2, 2)))
    assert(np.shape(np.dot(first, second)).containsSlice(Seq(2,2)))
    assert(java.lang.Double.valueOf(np.vdot(first, second).toString).compareTo(12.78d) == 0)
    assert(np.shape(np.inner(first, second)).containsSlice(Seq(2,2)))
    assert(np.shape(np.matmul(first, second)).containsSlice(Seq(2,2)))
    assert(np.shape(np.outer(first, second)).containsSlice(Seq(4,4)))


  }
}
