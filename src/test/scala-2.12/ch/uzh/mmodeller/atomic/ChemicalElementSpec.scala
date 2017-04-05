package ch.uzh.mmodeller.atomic

import ch.uzh.utils.Units.Ar
import ch.uzh.utils.units.Temperature._
import ch.uzh.utils.units.Pressure._
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

//  "A Chemical Element" should "return its Standard atomic weight" in {
//    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map(), Map(), Map())
//    c.standardAtomicWeight should be (new Ar(1.0))
//  }

  "A Chemical Element" should "have a correct melting point" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map("Melting point" -> List("(1 atm) 3800 (graphite) K (3527 °C, 6381 °F)")), Map(), Map())
    c.meltingPoint.get should be (K(3800))
  }

  "A Chemical Element" should "have a correct critical point" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map("Triple point" -> List("1K, 1kPa")), Map(), Map())
    c.triplePoint.get should be (K, kPa)
  }


  "A Chemical Element" should "return its Densities" in {
    val c = new ChemicalElement("test", "t", 1, 1.0,"", Map(), Map(), Map(), Map())
    c.densities should be (List())
  }

}
