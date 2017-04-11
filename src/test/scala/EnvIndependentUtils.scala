import java.io.File

import jep.Jep

/**
  * Created by Ganesh on 4/12/2017.
  */
object EnvIndependentUtils {
  private val instance:Jep=new Jep()
  def setup :Jep= {
    unsafe.Utils.unsafeAddDir(new File("jep_deps/lib/").getAbsolutePath)
    val os = System.getProperty("os.name").split(" ")(0).toLowerCase
    if (!os.startsWith("win")) {
      unsafe.Utils.unsafeAddDir(new File("/usr/lib/x86_64-linux-gnu/").getAbsolutePath)
    }
    System.load(new File("jep_deps/lib/").getAbsolutePath + (if (os.startsWith("win")) "/jep.dll" else "/libjep.so"))
    return instance
  }
}
