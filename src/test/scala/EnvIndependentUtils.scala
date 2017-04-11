import java.io.File

import jep.Jep

/**
  * Created by Ganesh on 4/12/2017.
  */
object EnvIndependentUtils {
  private var instance:Jep=null
  def setup :Jep= {
    if(instance==null){
    unsafe.Utils.unsafeAddDir(new File("jep_deps/lib/").getAbsolutePath)
    val os = System.getProperty("os.name").split(" ")(0).toLowerCase
    if (!os.startsWith("win")) {
      unsafe.Utils.unsafeAddDir(new File("/usr/lib/x86_64-linux-gnu/").getAbsolutePath)
      unsafe.Utils.unsafeAddDir(new File("/usr/local/lib/python3.4/dist-packages/jep/").getAbsolutePath)
    }
    System.load(new File("jep_deps/lib/").getAbsolutePath + (if (os.startsWith("win")) "/jep.dll" else "/libjep.so"))
    instance=new Jep()
    }
    return instance
  }
}
