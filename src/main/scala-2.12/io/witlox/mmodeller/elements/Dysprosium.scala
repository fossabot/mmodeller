package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Dysprosium extends ChemicalElementBase(66, 162.500) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Dy"
  def category = Category.Lanthanoids
  def col = 10
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f10 6s2"
  def electronsPerShell = List(2, 8, 18, 28, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic at K(300)"
  def casNumber = "7429-91-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.22)
  override def ionizationEnergies = Some(Map("1st" -> 573.0 * (kJ/mol), "2nd" -> 1130 * (kJ/mol), "3rd" -> 2200 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(228))
  override def electricalResistivity = Some((926 * nOhm*m, None))
  override def thermalConductivity = Some(List((10.7 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((9.9 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((2710 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(61.4), Some("α"))))
  override def shearModulus = Some(List((GPa(24.7), Some("α"))))
  override def bulkModulus = Some(List((GPa(40.5), Some("α"))))
  override def poissonRatio = Some(List((0.247, Some("α"))))
  override def vickersHardness = Some(List((MPa(540), None)))
  override def brinellHardness = Some(List((MPa(500), None)))

  override def density = Some(List((8.540 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (8.37 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1680), None))
  override def boilingPoint = Some((K(2840), None))
  override def heatOfFusion = Some((11.06 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((280 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.7 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
