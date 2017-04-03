package ch.uzh.mmodeller.atomic

import ch.uzh.utils.Units.{Length, MolarEnergy}


trait AtomicProperties {

  def oxidationStates: Option[Seq[Int]]
  def electronNegativity: Option[Float]
  def ionizationEnergies: Option[Seq[MolarEnergy]]
  def atomicRadius: Length
  def atomicRaduisCalc: Length
  def covalentRadius: Length
  def vanDerWaalsRadius: Length

}
