import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Ganesh on 4/11/2017.
  */
class LoadSharedObjectTest extends FlatSpec with Matchers{

  "Load shared object check for jvm" should "work otherwise something is wrong in setup" in{

    println(System.getProperty("java.library.path"))
  }
}
