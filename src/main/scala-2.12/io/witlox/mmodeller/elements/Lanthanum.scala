package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Lanthanum extends ChemicalElementBase(57, 138.90547) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "La"
  def category = Category.Lanthanoids
  def col = 1
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 5d1 6s2"
  def electronsPerShell = List(2, 8, 18, 18, 9, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-91-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.10)
  override def ionizationEnergies = Some(Map("1st" -> 538.1 * (kJ/mol), "2nd" -> 1067 * (kJ/mol), "3rd" -> 1850.3 * (kJ/mol)))
  override def atomicRadius = Some(pm(195))
  override def covalentRadius = Some(pm(169))
  override def electricalResistivity = Some((615 * nOhm*m, None))
  override def thermalConductivity = Some(List((13.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((12.1 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2475 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(36.6), Some("α"))))
  override def shearModulus = Some(List((GPa(14.3), Some("α"))))
  override def bulkModulus = Some(List((GPa(27.9), Some("α"))))
  override def poissonRatio = Some(List((0.280, Some("α"))))
  override def mohsHardness = Some(List((2.5, None)))
  override def vickersHardness = Some(List((MPa(491), None)))
  override def brinellHardness = Some(List((MPa(363), None)))

  override def density = Some(List((6.162 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.94 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1193), None))
  override def boilingPoint = Some((K(3737), None))
  override def heatOfFusion = Some((6.20 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((402.1 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.11 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
