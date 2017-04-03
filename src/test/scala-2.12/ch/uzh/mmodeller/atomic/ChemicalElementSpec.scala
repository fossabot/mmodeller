package ch.uzh.mmodeller.atomic

import ch.uzh.utils.Units.Ar
import org.scalatest._

class ChemicalElementSpec extends FlatSpec with Matchers {

  "A Chemical Element" should "return its Electrons per shell" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map("Electrons per shell" -> "1"), Map(), Map(), Map())
    c.electronsPerShell should be (List(1))
  }

  "A Chemical Element" should "return its Standard atomic weight" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map(), Map(), Map())
    c.standardAtomicWeight should be (new Ar(1.0))
  }

  "A Chemical Element" should "return its Standard atomic weight" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map(), Map(), Map())
    c.standardAtomicWeight should be (new Ar(1.0))
  }

//  "A Chemical Element" should "return its Densities" in {
//    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map(), Map(), Map())
//    c.densities should be (List())
//  }

}
