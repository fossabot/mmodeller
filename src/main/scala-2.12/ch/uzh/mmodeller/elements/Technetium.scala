package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{pm, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Technetium extends ChemicalElementBase(43, 98.0) with ChemicalGroup with CrystalStructure with MagneticOrdering with ElectronAffinity {
  def symbol = "Tc"
  def category = Category.TransitionMetals
  def group = 7
  def period = 5
  def block = 'd'
  def appearance = "silvery gray metal"
  def electronConfiguration = "[Kr] 4d5 5s2"
  def electronsPerShell = List(2, 8, 18, 13, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "Paramagnetic"
  def casNumber = "7440-26-8"
  def phase = MaterialState.Solid
  def electronAffinity = -53 * (kJ/mol)

  override def oxidationStates = Some(List(7, 6, 5, 4, 3, 1))
  override def electronNegativity = Some(1.9)
  override def ionizationEnergies = Some(Map("1st" -> 702* (kJ/mol), "2nd" -> 1470* (kJ/mol), "3rd" -> 2850* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(183))
  override def covalentRadius = Some(pm(156))
  override def thermalConductivity = Some(List((50.6 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((11 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(2430), None))
  override def boilingPoint = Some((K(4538), None))
  override def heatOfFusion = Some((33.29 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((585.2 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.27 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
