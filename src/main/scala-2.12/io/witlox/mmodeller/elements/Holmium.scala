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

object Holmium extends ChemicalElementBase(67, 164.93032) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Ho"
  def category = Category.Lanthanoids
  def col = 11
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f11 6s2"
  def electronsPerShell = List(2, 8, 18, 29, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-60-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.23)
  override def ionizationEnergies = Some(Map("1st" -> 581.0 * (kJ/mol), "2nd" -> 1140 * (kJ/mol), "3rd" -> 2204 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def electricalResistivity = Some((814 * nOhm*m, None))
  override def thermalConductivity = Some(List((16.2 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11.2 * (um/m*K), None, Some("poly")))

  override def speedOfSound = Some(List((2760 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(64.8), None)))
  override def shearModulus = Some(List((GPa(26.3), None)))
  override def bulkModulus = Some(List((GPa(40.2), None)))
  override def poissonRatio = Some(List((0.231, None)))
  override def vickersHardness = Some(List((MPa(481), None)))
  override def brinellHardness = Some(List((MPa(746), None)))

  override def density = Some(List((8.79 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (8.34 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1734), None))
  override def boilingPoint = Some((K(2993), None))
  override def heatOfFusion = Some((17.0 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((265 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.15 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
