package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Terbium extends ChemicalElementBase(65, 158.92535) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Tb"
  def category = Category.Lanthanoids
  def col = 9
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f9 6s2"
  def electronsPerShell = List(2, 8, 18, 27, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic at K(300)"
  def casNumber = "7440-27-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 4))
  override def electronNegativity = Some(1.2)
  override def ionizationEnergies = Some(Map("1st" -> 565.8 * (kJ/mol), "2nd" -> 1110 * (kJ/mol), "3rd" -> 2114 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(225))
  override def electricalResistivity = Some((1.150 * uOhm*m, None))
  override def thermalConductivity = Some(List((11.1 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((10.3 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2620 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(55.7), Some("α"))))
  override def shearModulus = Some(List((GPa(22.1), Some("α"))))
  override def bulkModulus = Some(List((GPa(38.7), Some("α"))))
  override def poissonRatio = Some(List((0.261, Some("α"))))
  override def vickersHardness = Some(List((MPa(863), None)))
  override def brinellHardness = Some(List((MPa(677), None)))

  override def density = Some(List((8.23 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.65 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1629), None))
  override def boilingPoint = Some((K(3503), None))
  override def heatOfFusion = Some((10.15 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((293 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((28.91 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
