package misc

import java.io.File

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Ganesh on 4/11/2017.
  */
class LoadSharedObjectTest extends FlatSpec with Matchers {

  "Load shared object check for jvm" should "work otherwise something is wrong in setup" in {
    unsafe.Utils.unsafeAddDir(new File("jep_deps/lib/").getAbsolutePath)
    val os = System.getProperty("os.name").split(" ")(0).toLowerCase
    System.load(new File("jep_deps/lib/").getAbsolutePath + (if(os.startsWith("win")) "/jep.dll" else "/libjep.so"))
    println(System.getProperty("java.library.path"))

    val paths = System.getProperty("java.library.path").replace('[', ' ').replace(']', ' ').split("(,|;|:)", -1)
    assert(paths.map(x => x.replace('\'', ' ')).exists {
      x =>
        val file = new File(x)
        println(file.exists()+" for "+file.getAbsolutePath+" is dir "+file.isDirectory)
        if(file.exists() && file.isDirectory())
          file.list().exists(_.matches("(lib)*jep.(so|dll)"))
        else
          false
    })
  }
}
