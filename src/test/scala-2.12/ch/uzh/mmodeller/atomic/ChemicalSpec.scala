package ch.uzh.mmodeller.atomic

import ch.uzh.mmodeller.chemical.Compound
import ch.uzh.mmodeller.dynamics.Space
import ch.uzh.utils.units.Temperature._
import ch.uzh.utils.units.Pressure._
import org.scalatest._

class ChemicalSpec extends FlatSpec with Matchers {

  "Constructing a compound of 1 atom" should "raises IllegalArgumentException" in {
    val space = new Space(K(0), atm(1))
    val thrown = intercept[IllegalArgumentException] {
      Compound("H", space)
    }
    assert(thrown.getMessage.contains("elements"))
  }

}
