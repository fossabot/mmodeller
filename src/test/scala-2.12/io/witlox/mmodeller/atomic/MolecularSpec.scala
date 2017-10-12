package io.witlox.mmodeller.atomic

import io.witlox.mmodeller.MaterialState
import io.witlox.mmodeller.dynamics.Space
import io.witlox.mmodeller.elements.Hydrogen
import io.witlox.mmodeller.molecular.Molecule
import io.witlox.mmodeller.utils.units.Pressure._
import io.witlox.mmodeller.utils.units.Temperature._
import org.scalatest._

class MolecularSpec extends FlatSpec with Matchers {

  "Constructing a molecule of 1 atom" should "raises IllegalArgumentException" in {
    val space = new Space(K(0), atm(1))
    val thrown = intercept[IllegalArgumentException] {
      Molecule(Hydrogen, 1, space)
    }
    assert(thrown.getMessage.contains("atoms"))
  }

  "Heating a molecule of H2 from absolute 1 to 30K under 1atm" should "show its transition states" in {
    val space = new Space(K(0), atm(1))
    val mol = Molecule(Hydrogen, 2, space)
    for (i <- 1 to 30) {
      space.changeTemperature(K(1))
      if (i <= 14) mol.phase should be (MaterialState.Solid)
      else if (i <= 20) mol.phase should be (MaterialState.Liquid)
      else mol.phase should be (MaterialState.Gas)
    }
  }
}
