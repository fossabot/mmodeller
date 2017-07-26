package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, uOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Erbium extends Atomic(68, 167.259) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Er"
  def category = Category.Lanthanoids
  def col = 12
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f12 6s2"
  def electronsPerShell = List(2, 8, 18, 30, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic at K(300)"
  def casNumber = "7440-52-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.24)
  override def ionizationEnergies = Some(Map("1st" -> 589.3 * (kJ/mol), "2nd" -> 1150 * (kJ/mol), "3rd" -> 2194 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(226))
  override def electricalResistivity = Some((0.860 * uOhm*m, None))
  override def thermalConductivity = Some(List((14.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((12.2 * (um/m*K), None, Some("poly"))

  override def speedOfSound = Some(List((2830 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(69.9), None)))
  override def shearModulus = Some(List((GPa(28.3), None)))
  override def bulkModulus = Some(List((GPa(44.4), None)))
  override def poissonRatio = Some(List((0.237, None)))
  override def vickersHardness = Some(List((MPa(589), None)))
  override def brinellHardness = Some(List((MPa(814), None)))

  override def density = Some(List((9.066 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (8.86 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1802), None))
  override def boilingPoint = Some((K(3141), None))
  override def heatOfFusion = Some((19.90 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((280 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((28.12 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
