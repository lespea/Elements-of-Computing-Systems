package com.lespea.elements.basic

import com.lespea.elements.{ IO1, IO2 }

case object Or extends Transform2To1 {
  @inline final def compute(in: IO2): IO1 =
    Nand.compute((
      Not.compute(in._1),
      Not.compute(in._2)))
}
