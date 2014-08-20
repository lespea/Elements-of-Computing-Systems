package com.lespea.elements.basic

import com.lespea.elements.IO1

case object Not extends Transform1To1 {
  @inline final def compute(in: IO1): IO1 = Nand.compute((in, in))
}
