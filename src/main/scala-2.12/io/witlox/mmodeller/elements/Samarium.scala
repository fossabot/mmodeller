package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Samarium extends ChemicalElementBase(62, 150.36) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Sm"
  def category = Category.Lanthanoids
  def col = 6
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 6s2 4f6"
  def electronsPerShell = List(2, 8, 18, 24, 8, 2)
  def crystalStructure = "rhombohedral"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-19-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.17)
  override def ionizationEnergies = Some(Map("1st" -> 544.5 * (kJ/mol), "2nd" -> 1070 * (kJ/mol), "3rd" -> 2260 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def atomicRadiusCalc = Some(pm(238))
  override def electricalResistivity = Some((0.940 * uOhm*m, None))
  override def thermalConductivity = Some(List((13.3 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((12.7 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2130 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(49.7), Some("α"))))
  override def shearModulus = Some(List((GPa(19.5), Some("α"))))
  override def bulkModulus = Some(List((GPa(37.8), Some("α"))))
  override def poissonRatio = Some(List((0.274, Some("α"))))
  override def vickersHardness = Some(List((MPa(412), None)))
  override def brinellHardness = Some(List((MPa(441), None)))

  override def density = Some(List((7.52 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.16 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1345), None))
  override def boilingPoint = Some((K(2067), None))
  override def heatOfFusion = Some((8.62 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((165 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((29.54 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
