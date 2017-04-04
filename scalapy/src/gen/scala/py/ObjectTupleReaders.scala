package py
import jep.Jep
trait ObjectTupleReaders {
implicit def tuple2Reader[T1, T2](implicit r1: ObjectReader[T1], r2: ObjectReader[T2]): ObjectReader[(T1, T2)] = {
  new ObjectReader[(T1, T2)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2])
    }
  }
}
implicit def tuple3Reader[T1, T2, T3](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3]): ObjectReader[(T1, T2, T3)] = {
  new ObjectReader[(T1, T2, T3)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3])
    }
  }
}
implicit def tuple4Reader[T1, T2, T3, T4](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4]): ObjectReader[(T1, T2, T3, T4)] = {
  new ObjectReader[(T1, T2, T3, T4)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4])
    }
  }
}
implicit def tuple5Reader[T1, T2, T3, T4, T5](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5]): ObjectReader[(T1, T2, T3, T4, T5)] = {
  new ObjectReader[(T1, T2, T3, T4, T5)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5])
    }
  }
}
implicit def tuple6Reader[T1, T2, T3, T4, T5, T6](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6]): ObjectReader[(T1, T2, T3, T4, T5, T6)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6])
    }
  }
}
implicit def tuple7Reader[T1, T2, T3, T4, T5, T6, T7](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7])
    }
  }
}
implicit def tuple8Reader[T1, T2, T3, T4, T5, T6, T7, T8](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8])
    }
  }
}
implicit def tuple9Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9])
    }
  }
}
implicit def tuple10Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10])
    }
  }
}
implicit def tuple11Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11])
    }
  }
}
implicit def tuple12Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12])
    }
  }
}
implicit def tuple13Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13])
    }
  }
}
implicit def tuple14Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14])
    }
  }
}
implicit def tuple15Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15])
    }
  }
}
implicit def tuple16Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16])
    }
  }
}
implicit def tuple17Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17])
    }
  }
}
implicit def tuple18Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17], r18: ObjectReader[T18]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17], r.arrayAccess(17).as[T18])
    }
  }
}
implicit def tuple19Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17], r18: ObjectReader[T18], r19: ObjectReader[T19]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17], r.arrayAccess(17).as[T18], r.arrayAccess(18).as[T19])
    }
  }
}
implicit def tuple20Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17], r18: ObjectReader[T18], r19: ObjectReader[T19], r20: ObjectReader[T20]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17], r.arrayAccess(17).as[T18], r.arrayAccess(18).as[T19], r.arrayAccess(19).as[T20])
    }
  }
}
implicit def tuple21Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17], r18: ObjectReader[T18], r19: ObjectReader[T19], r20: ObjectReader[T20], r21: ObjectReader[T21]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17], r.arrayAccess(17).as[T18], r.arrayAccess(18).as[T19], r.arrayAccess(19).as[T20], r.arrayAccess(20).as[T21])
    }
  }
}
implicit def tuple22Reader[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](implicit r1: ObjectReader[T1], r2: ObjectReader[T2], r3: ObjectReader[T3], r4: ObjectReader[T4], r5: ObjectReader[T5], r6: ObjectReader[T6], r7: ObjectReader[T7], r8: ObjectReader[T8], r9: ObjectReader[T9], r10: ObjectReader[T10], r11: ObjectReader[T11], r12: ObjectReader[T12], r13: ObjectReader[T13], r14: ObjectReader[T14], r15: ObjectReader[T15], r16: ObjectReader[T16], r17: ObjectReader[T17], r18: ObjectReader[T18], r19: ObjectReader[T19], r20: ObjectReader[T20], r21: ObjectReader[T21], r22: ObjectReader[T22]): ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)] = {
  new ObjectReader[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)] {
    override def read(or: Ref)(implicit jep: Jep) = {
      val r = Ref(or.expr).asInstanceOf[DynamicRef]
      (r.arrayAccess(0).as[T1], r.arrayAccess(1).as[T2], r.arrayAccess(2).as[T3], r.arrayAccess(3).as[T4], r.arrayAccess(4).as[T5], r.arrayAccess(5).as[T6], r.arrayAccess(6).as[T7], r.arrayAccess(7).as[T8], r.arrayAccess(8).as[T9], r.arrayAccess(9).as[T10], r.arrayAccess(10).as[T11], r.arrayAccess(11).as[T12], r.arrayAccess(12).as[T13], r.arrayAccess(13).as[T14], r.arrayAccess(14).as[T15], r.arrayAccess(15).as[T16], r.arrayAccess(16).as[T17], r.arrayAccess(17).as[T18], r.arrayAccess(18).as[T19], r.arrayAccess(19).as[T20], r.arrayAccess(20).as[T21], r.arrayAccess(21).as[T22])
    }
  }
}
}