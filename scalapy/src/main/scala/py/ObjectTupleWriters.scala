package py
import jep.Jep
trait ObjectTupleWriters {
implicit def tuple2Writer[T1, T2](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2]): ObjectWriter[(T1, T2)] = {
  new ObjectWriter[(T1, T2)] {
    override def write(v: (T1, T2))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})")
      array.asRef
    }
  }
}
implicit def tuple3Writer[T1, T2, T3](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3]): ObjectWriter[(T1, T2, T3)] = {
  new ObjectWriter[(T1, T2, T3)] {
    override def write(v: (T1, T2, T3))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})")
      array.asRef
    }
  }
}
implicit def tuple4Writer[T1, T2, T3, T4](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4]): ObjectWriter[(T1, T2, T3, T4)] = {
  new ObjectWriter[(T1, T2, T3, T4)] {
    override def write(v: (T1, T2, T3, T4))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})")
      array.asRef
    }
  }
}
implicit def tuple5Writer[T1, T2, T3, T4, T5](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5]): ObjectWriter[(T1, T2, T3, T4, T5)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5)] {
    override def write(v: (T1, T2, T3, T4, T5))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})")
      array.asRef
    }
  }
}
implicit def tuple6Writer[T1, T2, T3, T4, T5, T6](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6]): ObjectWriter[(T1, T2, T3, T4, T5, T6)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6)] {
    override def write(v: (T1, T2, T3, T4, T5, T6))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})")
      array.asRef
    }
  }
}
implicit def tuple7Writer[T1, T2, T3, T4, T5, T6, T7](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})")
      array.asRef
    }
  }
}
implicit def tuple8Writer[T1, T2, T3, T4, T5, T6, T7, T8](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})")
      array.asRef
    }
  }
}
implicit def tuple9Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})")
      array.asRef
    }
  }
}
implicit def tuple10Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})")
      array.asRef
    }
  }
}
implicit def tuple11Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})")
      array.asRef
    }
  }
}
implicit def tuple12Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})")
      array.asRef
    }
  }
}
implicit def tuple13Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})")
      array.asRef
    }
  }
}
implicit def tuple14Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})")
      array.asRef
    }
  }
}
implicit def tuple15Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})")
      array.asRef
    }
  }
}
implicit def tuple16Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})")
      array.asRef
    }
  }
}
implicit def tuple17Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})")
      array.asRef
    }
  }
}
implicit def tuple18Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17], r18: ObjectWriter[T18]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._18).expr})")
      array.asRef
    }
  }
}
implicit def tuple19Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17], r18: ObjectWriter[T18], r19: ObjectWriter[T19]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._18).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._19).expr})")
      array.asRef
    }
  }
}
implicit def tuple20Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17], r18: ObjectWriter[T18], r19: ObjectWriter[T19], r20: ObjectWriter[T20]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._18).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._19).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._20).expr})")
      array.asRef
    }
  }
}
implicit def tuple21Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17], r18: ObjectWriter[T18], r19: ObjectWriter[T19], r20: ObjectWriter[T20], r21: ObjectWriter[T21]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._18).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._19).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._20).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._21).expr})")
      array.asRef
    }
  }
}
implicit def tuple22Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](implicit r1: ObjectWriter[T1], r2: ObjectWriter[T2], r3: ObjectWriter[T3], r4: ObjectWriter[T4], r5: ObjectWriter[T5], r6: ObjectWriter[T6], r7: ObjectWriter[T7], r8: ObjectWriter[T8], r9: ObjectWriter[T9], r10: ObjectWriter[T10], r11: ObjectWriter[T11], r12: ObjectWriter[T12], r13: ObjectWriter[T13], r14: ObjectWriter[T14], r15: ObjectWriter[T15], r16: ObjectWriter[T16], r17: ObjectWriter[T17], r18: ObjectWriter[T18], r19: ObjectWriter[T19], r20: ObjectWriter[T20], r21: ObjectWriter[T21], r22: ObjectWriter[T22]): ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)] = {
  new ObjectWriter[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)] {
    override def write(v: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22))(implicit jep: Jep): Ref = {
      val array = Object("[]")
      jep.eval(s"${array.expr}.append(${Ref.from(v._1).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._2).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._3).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._4).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._5).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._6).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._7).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._8).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._9).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._10).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._11).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._12).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._13).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._14).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._15).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._16).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._17).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._18).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._19).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._20).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._21).expr})");jep.eval(s"${array.expr}.append(${Ref.from(v._22).expr})")
      array.asRef
    }
  }
}
}