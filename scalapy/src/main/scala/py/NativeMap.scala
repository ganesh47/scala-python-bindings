package py

import jep.Jep
import py._

class NativeMap[K, T](private[py] val orig: Ref)(implicit reader1: ObjectReader[K], reader2: ObjectReader[T], jep: Jep) extends collection.immutable.Map[K, T] {
  protected lazy val origDynamic = orig.toObject.asInstanceOf[DynamicObject]

  override lazy val size: Int = global.len(orig).as[Int]

  override def apply(idx: K): T = this.get(idx).getOrElse[T](throw new IllegalArgumentException(s" key $idx does not exist in map!"))

  override def +[V1 >: T](kv: (K, V1)): Map[K, V1] = {
    jep.eval(s"${origDynamic.expr}[${kv._1}]=${kv._2}")
    this
  }

  override def get(key: K): Option[T] = jep.getValue(s"${origDynamic.expr}[$key]") match {
    case null => scala.None
    case x: T => scala.Some(x)
  }

  override def -(key: K): Map[K, T] = {
    jep.eval(s"del ${origDynamic.expr}[${key}]")
    this
  }

  def foldr[A, B]( combine: (A, =>B) => B, base: B )(xs: Stream[A]): B = if (xs.isEmpty) base else combine(xs.head, foldr(combine, base)(xs.tail))
  //TODO transform with above lazy foldr!
  override def iterator: Iterator[(K, T)] = global.list(origDynamic.keys()).as[Seq[K]].foldRight(Nil: List[(K, T)])((x, y) => (x, get(x).get) :: y).iterator
}
