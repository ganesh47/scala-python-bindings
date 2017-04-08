import jep.Jep
import org.scalatest.{FlatSpec, Matchers}
import py.py

/**
  * Created by Ganesh on 4/8/2017.
  */
class PandasFacadeTest extends FlatSpec with Matchers{

  "Test Sample Pandas" should "work" in{

    implicit val jep = new Jep()
    // prep for tensorflow
    val sys = py.module("sys")
    val str = py.module("string")
    println(sys.path)
    sys.argv = Array("jep")
    sys.path.insert(0, "./src/main/python")
    val pd =py.module("pandas")
    val np =py.module("numpy")
    val numbers = List(1, 2, 3)
    val series = pd.Series(numbers)

    println(series.iloc.atIndex(2))

  }
}
