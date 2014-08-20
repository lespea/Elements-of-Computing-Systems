package com.lespea.elements.basic

import com.lespea.elements._

case object Xor extends Transform2To1 {
  @inline final def compute(in: IO2): IO1 = {
    val c = Nand.compute(in)

    Nand.compute((
      Nand.compute((in._1, c)),
      Nand.compute((in._2, c))))
  }
}
