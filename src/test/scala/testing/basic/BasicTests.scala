package testing.basic

import com.lespea.elements.basic._
import org.scalatest.WordSpec

final class BasicTests extends WordSpec with LogicTests {
  "A NAND gate" should {
    behave like validLogicTable(Nand, Seq(
      ((false, false), true),
      ((true, false), true),
      ((false, true), true),
      ((true, true), false)))
  }

  "A Not gate" should {
    behave like validLogicTable(Not, Seq(
      (false, true),
      (true, false)))
  }

  "An And gate" should {
    behave like validLogicTable(And, Seq(
      ((false, false), false),
      ((true, false), false),
      ((false, true), false),
      ((true, true), true)))
  }

  "An Or gate" should {
    behave like validLogicTable(Or, Seq(
      ((false, false), false),
      ((true, false), true),
      ((false, true), true),
      ((true, true), true)))
  }
}
