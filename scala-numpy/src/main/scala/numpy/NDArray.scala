package numpy

import jep.Jep
import py._

class NDArray[T](orig: Ref)(implicit reader: ObjectReader[T], jep: Jep) extends NativeSeq[T](orig) {
  def unary_-(): NDArray[T] = (-origDynamic).as[NDArray[T]]

  def +(o: T)(implicit writer: ObjectWriter[T]): NDArray[T] = (origDynamic + o).as[NDArray[T]]
  def +(o: NDArray[T])(implicit writer: ObjectWriter[NDArray[T]]): NDArray[T] = (origDynamic + o).as[NDArray[T]]

  def -(o: T)(implicit writer: ObjectWriter[T]): NDArray[T] = (origDynamic - o).as[NDArray[T]]
  def -(o: NDArray[T])(implicit writer: ObjectWriter[NDArray[T]]): NDArray[T] = (origDynamic - o).as[NDArray[T]]

  def *(o: T)(implicit writer: ObjectWriter[T]): NDArray[T] = (origDynamic * o).as[NDArray[T]]
  def *(o: NDArray[T])(implicit writer: ObjectWriter[NDArray[T]]): NDArray[T] = (origDynamic * o).as[NDArray[T]]

  def /(o: T)(implicit writer: ObjectWriter[T]): NDArray[T] = (origDynamic / o).as[NDArray[T]]
  def /(o: NDArray[T])(implicit writer: ObjectWriter[NDArray[T]]): NDArray[T] = (origDynamic / o).as[NDArray[T]]

  def astype(newType: NumPyType): NDArray[T] = origDynamic.astype(newType).as[NDArray[T]]
}

object NDArray {
  implicit def seqReader[T](implicit reader: ObjectReader[T]): ObjectReader[NDArray[T]] = new ObjectReader[NDArray[T]] {
    def read(r: Ref)(implicit jep: Jep) = new NDArray[T](r)(reader, jep)
  }
}
