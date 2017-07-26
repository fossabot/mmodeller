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

object Praseodymium extends Atomic(59, 140.90765) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Pr"
  def category = Category.Lanthanoids
  def col = 3
  def row = 1
  def block = 'f'
  def appearance = "grayish white"
  def electronConfiguration = "[Xe] 4f3 6s2"
  def electronsPerShell = List(2, 8, 18, 21, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic "
  def casNumber = "7440-10-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.13)
  override def ionizationEnergies = Some(Map("1st" -> 527 * (kJ/mol), "2nd" -> 1020 * (kJ/mol), "3rd" -> 2086 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def atomicRadiusCalc = Some(pm(247))
  override def electricalResistivity = Some((0.700 * uOhm*m, None))
  override def thermalConductivity = Some(List((12.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.7 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2280 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(37.3), Some("α"))))
  override def shearModulus = Some(List((GPa(14.8), Some("α"))))
  override def bulkModulus = Some(List((GPa(28.8), Some("α"))))
  override def poissonRatio = Some(List((0.281, Some("α"))))
  override def vickersHardness = Some(List((MPa(400), None)))
  override def brinellHardness = Some(List((MPa(481), None)))

  override def density = Some(List((6.77 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.50 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1208), None))
  override def boilingPoint = Some((K(3793), None))
  override def heatOfFusion = Some((6.89 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((331 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.20 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
