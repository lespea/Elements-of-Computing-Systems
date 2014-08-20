package com.lespea.elements.basic

import com.lespea.elements._

sealed trait Transformer[A, B] {
  def compute(in: A): B
}

abstract class Transform1To1 extends Transformer[IO1, IO1]

abstract class Transform2To1 extends Transformer[IO2, IO1]

abstract class Transorm2To2 extends Transformer[IO2, IO2]
