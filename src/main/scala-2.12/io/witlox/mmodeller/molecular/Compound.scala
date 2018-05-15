package io.witlox.mmodeller.molecular

import io.witlox.mmodeller.dynamics.Space

class Compound(composite: String, space: Space) extends Molecule(composite, space) {

  require(atoms.keys.size > 1, "Compound must contain 2 or more elements")

}

