package io.witlox.mmodeller.atomic

import io.witlox.mmodeller.dynamics.Space
import io.witlox.mmodeller.molecular.Compound
import io.witlox.mmodeller.utils.units.Temperature._
import io.witlox.mmodeller.utils.units.Pressure._
import org.scalatest._

class ChemicalSpec extends FlatSpec with Matchers {

  "Constructing a compound of 1 atom" should "raises IllegalArgumentException" in {
    val space = new Space(K(0), atm(1))
    val thrown = intercept[IllegalArgumentException] {
      new Compound("H2", space)
    }
    assert(thrown.getMessage.contains("molecule"))
  }



}
