package com.lespea.elements.basic

import com.lespea.elements.{ IO1, IO2 }

case object Nand extends Transform2To1 {
  @inline final def compute(in: IO2): IO1 = !(in._1 & in._2)
}
