package com.lespea.elements.basic

import com.lespea.elements.{ IO2, IO1 }

case object And extends Transform2To1 {
  @inline final def compute(in: IO2): IO1 =
    Not.compute(
      Nand.compute(in))
}
