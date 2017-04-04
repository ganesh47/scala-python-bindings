package py

import scala.collection.mutable
import scala.concurrent.Future
import jep.Jep



object py {


  def module(name: String)(implicit jep: Jep) = Module(name)
  def module(name: String, subname: String)(implicit jep: Jep) = Module(name, subname)

  def global(implicit jep: Jep) = new Global()

  def lambda(ref: Ref) = Ref(s"lambda: ${ref.expr}")

  class None private[py] extends Ref("None")
  val None = new None

  implicit def toNativeSeqMapper[T, C <% Seq[T]](s: C)(implicit jep: Jep): ToNativeSeqMapper[T] = new ToNativeSeqMapper[T](s)

  type NoneOr[T] = None | T

  def local(f: => Unit): Unit = {
    Object.allocatedObjects = mutable.Queue.empty[Object] :: Object.allocatedObjects
    f

    val toClean = Object.allocatedObjects.head

    Future {
      toClean.foreach { c =>
        c.finalize()
      }
    }(scala.concurrent.ExecutionContext.Implicits.global)

    Object.allocatedObjects = Object.allocatedObjects.tail
  }
}
