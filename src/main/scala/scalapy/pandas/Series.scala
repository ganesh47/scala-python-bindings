package scalapy.pandas


import jep.Jep
import numpy.{NDArray, NumPy}
import py._

import scalapy.pandas.Series.{C_Ravel_Order, Interpolation, RavelOrder, linear}

/**
  * Created by Ganesh on 4/8/2017.
  */
class Series[T](obj: Ref)(implicit jep: Jep,reader: ObjectReader[T]) extends NativeSeq[T](obj) {


  override def toString(): String = py.global.str(obj).toString()

  override def iterator: Iterator[T] = this.tolist().iterator



  /**
    * Return Series as ndarray or ndarray-like depending on the dtype
    * Example ..
    * >>> pd.Series([1, 2, 3]).values
    * array([1, 2, 3])
    *
    * @return
    * @return
    */
  def get_values: NDArray[T] = origDynamic.get_values().as[NDArray[T]]

  /**
    */
  def values: NDArray[T] = origDynamic.values.as[NDArray[T]]

  /**
    * same as values (but handles sparseness conversions); is a view
    *
    * Return the flattened underlying data as an ndarray
    */
  def ravel(order: RavelOrder = C_Ravel_Order): NDArray[T] = origDynamic.ravel(order.toString).as[NDArray[T]]

  /**
    * Return selected slices of an array along given axis as a Series
    */
  def compress(condition: Ref): Series[T] = origDynamic.compress(condition).as[Series[T]]

  /**
    * Return the indices of the elements that are non-zero
    */
  def nonzero(): Seq[Ref] = origDynamic.nonzero().as[Seq[Ref]]

  def len(): Int = origDynamic.__len__().as[Int]

  def axes(): NDArray[Ref] = origDynamic.axes.as[NDArray[Ref]]

  def repeat(reps: Ref* ): Series[T] = origDynamic.repeat(reps).as[Series[T]]

  @deprecated(message = "Calling this might raise an error based on version of pandas you might have! use .values.reshape instead!")
  def reshape(args: Int = 1): Series[T] = origDynamic.repeat(args).as[Series[T]]

  def get_value(label: Ref, takeable: Boolean = false): T = origDynamic.get_value(label, takeable).as[T]

  def set_value(label: Ref, value: Ref, takeable: Boolean = false): Series[T] = origDynamic.set_value(label, value, takeable).as[Series[T]]

  def keys(): Seq[Int] = origDynamic.keys().as[Seq[Int]]

  def tolist(): Seq[T] = origDynamic.tolist().as[Seq[T]]

  def to_dict(): Map[Ref, T] = origDynamic.to_dict().as[Map[Ref, T]]

  def to_frame() = ???

  def to_sparse() = ???

  def count(): Int = origDynamic.count().as[Int]

  def mode(): Series[Int] = origDynamic.mode().as[Series[Int]]

  def idxmin(axis: Ref = py.None, skipna: Boolean = true ): Int = origDynamic.idxmin(axis, skipna).as[Int]

  def idxmax(axis: Ref = py.None, skipna: Boolean = true): Int = origDynamic.idxmax(axis, skipna).as[Int]

  def round(decimals: Int = 0): Series[T] = origDynamic.round(decimals).as[Series[T]]

  def quantile(q: Double = 0.5, interpolation: Interpolation = linear): Series[T] = origDynamic.quantile(q, interpolation.toString).as[Series[T]]

  def corr(other: Series[T], method: String = "pearson", min_periods: Ref = null): Nothing = ???

  def cov(other: Series[T], min_periods: Ref = null): Nothing = ???

  def diff(periods: Int = 1): Series[T] = origDynamic.diff(periods).as[Series[T]]

  def autocorr(lag: Int): Double = origDynamic.autocorr(lag).as[Double]

  def dot(other: Series[T]): Nothing = ???

  def append(to_append: Series[T], ignore_index: Boolean = false, verify_integrity: Boolean = false): Nothing = ???

  def combine(other: Series[T], func: PyFunction, fill_value: Ref = py.module("numpy").as[NumPy].nan): Nothing = ???

  def combine_first(other: Series[T]): Nothing = ???


}

object Series {


  implicit def seqReader[T](implicit reader: ObjectReader[T]): ObjectReader[Series[T]] = new ObjectReader[Series[T]] {
    def read(r: Ref)(implicit jep: Jep) = new Series[T](r)(jep,reader)
  }

  sealed trait RavelOrder
  sealed trait Interpolation

  case object linear extends Interpolation
  case object higher extends Interpolation
  case object midpoint extends Interpolation
  case object nearest extends Interpolation
  case object lower extends Interpolation

  case object C_Ravel_Order extends RavelOrder {
    override def toString = "C"
  }

  case object F_Ravel_Order extends RavelOrder {
    override def toString = "F"
  }

  case object A_Ravel_Order extends RavelOrder {
    override def toString = "A"
  }

  case object K_Ravel_Order extends RavelOrder {
    override def toString = "K"
  }

}
