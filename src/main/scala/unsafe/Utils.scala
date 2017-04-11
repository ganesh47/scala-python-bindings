package unsafe

/**
  * Created by Ganesh on 4/11/2017.
  */
object Utils {

  def unsafeAddDir(dir: String) = try {
    val field = classOf[ClassLoader].getDeclaredField("usr_paths")
    field.setAccessible(true)
    val paths = field.get(null).asInstanceOf[Array[String]]
    if (!(paths contains dir)) {
      field.set(null, paths :+ dir)
      System.setProperty("java.library.path",
        System.getProperty("java.library.path") +
          java.io.File.pathSeparator +
          dir)
    }
  } catch {
    case _: IllegalAccessException =>
      throw new Exception("Insufficient permissions; can't modify private variables.")
    case _: NoSuchFieldException =>
      throw new Exception("JVM implementation incompatible with path hack")
  }
}
