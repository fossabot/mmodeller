package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Thorium extends Atomic(90, 232.03806) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Th"
  def category = Category.Actinoids
  def col = 2
  def row = 2
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Rn] 6d2 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 18, 10, 2)
  def crystalStructure = "face centered cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-29-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 587 * (kJ/mol), "2nd" -> 1110 * (kJ/mol), "3rd" -> 1930 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def electricalResistivity = Some((147 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((54.0 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11.0 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2490 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(79), None)))
  override def shearModulus = Some(List((GPa(31), None)))
  override def bulkModulus = Some(List((GPa(54), None)))
  override def poissonRatio = Some(List((0.27, None)))
  override def mohsHardness = Some(List((3, None)))
  override def vickersHardness = Some(List((MPa(350), None)))
  override def brinellHardness = Some(List((MPa(400), None)))

  override def density = Some(List((11.7 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(2115), None))
  override def boilingPoint = Some((K(5061), None))
  override def heatOfFusion = Some((13.81 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((514 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.230 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
