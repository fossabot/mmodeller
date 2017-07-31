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

object Neodymium extends ChemicalElementBase(60, 144.242) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Nd"
  def category = Category.Lanthanoids
  def col = 4
  def row = 1
  def block = 'f'
  def appearance = "silvery white, yellowish tinge"
  def electronConfiguration = "[Xe] 4f4 6s2"
  def electronsPerShell = List(2, 8, 18, 22, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic, antiferromagnetic below K(20)"
  def casNumber = "7440-00-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.14)
  override def ionizationEnergies = Some(Map("1st" -> 533.1 * (kJ/mol), "2nd" -> 1040 * (kJ/mol), "3rd" -> 2130 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def atomicRadiusCalc = Some(pm(206))
  override def electricalResistivity = Some((643 * nOhm*m, None))
  override def thermalConductivity = Some(List((16.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((9.6 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2330 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(41.4), Some("α"))))
  override def shearModulus = Some(List((GPa(16.3), Some("α"))))
  override def bulkModulus = Some(List((GPa(31.8), Some("α"))))
  override def poissonRatio = Some(List((0.281, Some("α"))))
  override def vickersHardness = Some(List((MPa(343), None)))
  override def brinellHardness = Some(List((MPa(265), None)))

  override def density = Some(List((7.01 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.89 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1297), None))
  override def boilingPoint = Some((K(3347), None))
  override def heatOfFusion = Some((7.14 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((289 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.45 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
