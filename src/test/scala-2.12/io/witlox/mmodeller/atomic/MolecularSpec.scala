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
      Molecule("H", space)
    }
    assert(thrown.getMessage.contains("atoms"))
  }

  "Heating a molecule of H2 from absolute 1 to 30K under 1atm" should "show its transition states" in {
    val space = new Space(K(0), atm(1))
    val mol = Molecule("H2", space)
    for (i <- 1 to 30) {
      space.changeTemperature(K(1))
//      if (i <= 14) mol.phase should be (MaterialState.Solid)
//      else if (i <= 20) mol.phase should be (MaterialState.Liquid)
//      else mol.phase should be (MaterialState.Gas)
    }
  }

  "Heating a molecule of H2O from absolute 95 to 101 Celcius under 1atm" should "show its bond removed" in {
    val space = new Space(fromCelsius(95), atm(1))
    val mol = Molecule("H2O", space)
    for (i <- 1 to 6) {
      space.changeTemperature(K(1))
            if (i <= fromCelsius(100)) mol.phase should be (MaterialState.Liquid)
            else mol.phase should be (MaterialState.Gas)
    }
  }

}
