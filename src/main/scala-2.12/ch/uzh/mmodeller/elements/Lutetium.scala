package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}
import ch.uzh.utils.units.Volume.cm3

object Lutetium extends Atomic(71, 174.9668) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Lu"
  def category = Category.Lanthanoids
  def col = 15
  def row = 1
  def block = 'd'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 6s2 4f14 5d1"
  def electronsPerShell = List(2, 8, 18, 32, 9, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-94-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.27)
  override def ionizationEnergies = Some(Map("1st" -> 523.5 * (kJ/mol), "2nd" -> 1340 * (kJ/mol), "3rd" -> 2022.3 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(217))
  override def covalentRadius = Some(pm(160))
  override def electricalResistivity = Some((582 * nOhm*m, None))
  override def thermalConductivity = Some(List((16.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((9.9 * (um/m*K), None, Some("poly"))

  override def youngModulus = Some(List((GPa(68.6), None)))
  override def shearModulus = Some(List((GPa(27.2), None)))
  override def bulkModulus = Some(List((GPa(47.6), None)))
  override def poissonRatio = Some(List((0.261, None)))
  override def vickersHardness = Some(List((MPa(1160), None)))
  override def brinellHardness = Some(List((MPa(893), None)))

  override def density = Some(List((9.841 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (9.3 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1925), None))
  override def boilingPoint = Some((K(3675), None))
  override def heatOfFusion = Some((22 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((414 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.86 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
