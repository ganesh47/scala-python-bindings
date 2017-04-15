package numpytest

import java.lang.management.ManagementFactory

import numpy.NumPy
import org.scalatest.{FlatSpec, Matchers}
import py.py
import utils.EnvIndependentUtils._
/**
  * Created by Ganesh on 4/14/2017.
  */
class NumpyNDArrayTests extends FlatSpec with Matchers{

  "NDArrayTest" should " work " in{
    println(ManagementFactory.getRuntimeMXBean().getName().split("@")(0))
    println("shuhu")
    implicit val jep=setup
    val sys = py.module("sys")
    sys.argv = Array("jep")
    sys.path.insert(0, "./src/main/python")
    println(sys.version)
    val np=py.module("numpy").as[NumPy]
    println(np.random.rand(100).astype(np.float32))


  }
}
