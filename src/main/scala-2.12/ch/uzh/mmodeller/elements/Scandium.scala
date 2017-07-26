package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{pm, um, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Scandium extends Atomic(21, 44.955912) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Sc"
  def category = Category.TransitionMetals
  def group = 3
  def period = 4
  def block = 'd'
  def appearance = "silvery white"
  def electronConfiguration = "[Ar] 3d1 4s2"
  def electronsPerShell = List(2, 8, 9, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-20-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2, 1))
  override def electronNegativity = Some(1.36)
  override def ionizationEnergies = Some(Map("1st" -> 633.1 * (kJ/mol), "2nd" -> 1235.0 * (kJ/mol), "3rd" -> 2388.6 * (kJ/mol)))
  override def atomicRadius = Some(pm(160))
  override def atomicRadiusCalc = Some(pm(184))
  override def covalentRadius = Some(pm(144))
  override def electricalResistivity = Some((562 * nOhm*m, None))
  override def thermalConductivity = Some(List((15.8 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((10.2 * (um/m*K), None, Some("α")))

  override def youngModulus = Some(List((GPa(74.4), None)))
  override def shearModulus = Some(List((GPa(29.1), None)))
  override def bulkModulus = Some(List((GPa(56.6), None)))
  override def poissonRatio = Some(List((0.279, None)))
  override def brinellHardness = Some(List((MPa(750), None)))

  override def density = Some(List((2.985 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (2.80 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1814), None))
  override def boilingPoint = Some((K(3109), None))
  override def heatOfFusion = Some((14.1 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((332.7 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.52 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
