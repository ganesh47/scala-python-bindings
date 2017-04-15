package pandas

import jep.Jep
import org.scalatest.{FlatSpec, Matchers}
import py.py
import utils.EnvIndependentUtils

import scalapy.pandas.Series.{A_Ravel_Order, F_Ravel_Order, K_Ravel_Order, higher, lower, midpoint, nearest}

/**
  * Created by Ganesh on 4/8/2017.
  */
class PandasSeriesFacadeTest extends FlatSpec with Matchers {

  "Test Series Facade" should "Type Check And Execute" in {
    implicit val jepp: Jep = EnvIndependentUtils.setup
    val sys = py.module("sys")
    println(sys.path)
    sys.argv = Array("jep")
    sys.path.insert(0, "./src/main/python")
    val pd = py.module("pandas")
    val numbers = List(1, 2, 3)
    val source = Map(0 -> 1, 1 -> 2, 2 -> 3)
    val series = pd.Series(numbers).as[scalapy.pandas.Series[Int]]

    assert(((1 to 3) map (x => series.tolist().contains(x))).forall(identity))
    assert(series.get_values.toString().equals("NDArray(1, 2, 3)"))
    assert(series.values.toString().equals("NDArray(1, 2, 3)"))
    assert(series.ravel().toString().equals("NDArray(1, 2, 3)"))
    assert(series.ravel(F_Ravel_Order).toString().equals("NDArray(1, 2, 3)"))
    assert(series.ravel(A_Ravel_Order).toString().equals("NDArray(1, 2, 3)"))
    assert(series.ravel(K_Ravel_Order).toString().equals("NDArray(1, 2, 3)"))
    assert(series.ravel().toString().equals("NDArray(1, 2, 3)"))
    assert((2 to 3).map { x => series.compress(List(1, 2)).tolist().contains(x) }.forall(identity))
    assert(series.nonzero().toString().equals("NativeSeq([0 1 2])"))
    assert(series.len().toString.equals("3"))
    assert(series.axes().toString().equals("NDArray(RangeIndex(start=0, stop=3, step=1))"))
    assert((1 to 3).map { x => series.repeat(2).tolist().count(_.equals(x)).equals(2) }.forall(identity))
    assert((1 to 3).map { x => series.reshape(2).tolist().count(_.equals(x)).equals(2) }.forall(identity))
    assert(series.keys().containsSlice(Seq(0, 1, 2)))
    assert(series.to_dict().forall(x => source.contains(Integer.parseInt(x._1.toString))))
    assert(series.count() == 3)
    assert(series.mode().count() == 0)
    assert(series.idxmin().equals(0))
    assert(series.idxmax().equals(2))
    assert(series.round().tolist().containsSlice(Seq(1, 2, 3)))
    assert(series.quantile().toString().contains("2.0"))
    assert(series.quantile(interpolation = higher).toString().contains("2"))
    assert(series.quantile(interpolation = midpoint).toString().contains("2.0"))
    assert(series.quantile(interpolation = nearest).toString().contains("2"))
    assert(series.quantile(interpolation = lower).toString().contains("2"))

  }
}
