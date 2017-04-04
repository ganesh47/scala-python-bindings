package py

import jep.Jep

import scala.language.dynamics

class DynamicObject private[py](varId: Int)(implicit jep: Jep) extends Object(varId) with scala.Dynamic {
  def applyDynamic(method: String)(params: Ref*): DynamicObject = {
    Object(s"$expr.$method(${params.map(_.expr).mkString(",")})").asInstanceOf[DynamicObject]
  }

  def applyDynamicNamed(method: String)(params: (String, Ref)*): DynamicObject = {
    Object(s"$expr.$method(${params.map(t => s"${t._1} = ${t._2.expr}").mkString(",")})").asInstanceOf[DynamicObject]
  }

  def selectDynamic(value: String): DynamicObject = {
    Object(s"$expr.$value").asInstanceOf[DynamicObject]
  }

  def arrayAccess(key: Ref): DynamicObject = {
    Object(s"$expr[${key.expr}]").asInstanceOf[DynamicObject]
  }

  def unary_+(): DynamicObject = {
    Object(s"+$expr").asInstanceOf[DynamicObject]
  }

  def unary_-(): DynamicObject = {
    Object(s"-$expr").asInstanceOf[DynamicObject]
  }

  def +(that: Ref): DynamicObject = {
    Object(s"$expr + (${that.expr})").asInstanceOf[DynamicObject]
  }

  def -(that: Ref): DynamicObject = {
    Object(s"$expr - (${that.expr})").asInstanceOf[DynamicObject]
  }

  def *(that: Ref): DynamicObject = {
    Object(s"$expr * (${that.expr})").asInstanceOf[DynamicObject]
  }

  def /(that: Ref): DynamicObject = {
    Object(s"$expr / (${that.expr})").asInstanceOf[DynamicObject]
  }

  def %(that: Ref): DynamicObject = {
    Object(s"$expr % (${that.expr})").asInstanceOf[DynamicObject]
  }
}

object DynamicObject {
  implicit def from[T](v: T)(implicit writer: ObjectWriter[T], jep: Jep): DynamicObject = {
    writer.write(v).toObject.asInstanceOf[DynamicObject]
  }
}
