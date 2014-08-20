package testing.basic

import com.lespea.elements.basic.Transformer
import org.scalatest.{ Matchers, Inspectors, WordSpec }

trait LogicTests extends Inspectors with Matchers { this: WordSpec ⇒
  final def validLogicTable[A, B, T <: Transformer[A, B]](transformer: T, tests: Seq[(A, B)]): Unit = {
    "conform to its logic tests" in {
      forAll(tests) { case (in, out) ⇒ transformer.compute(in) shouldBe out }
    }
  }
}
