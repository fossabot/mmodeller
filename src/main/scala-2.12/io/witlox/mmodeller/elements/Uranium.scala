package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Uranium extends ChemicalElementBase(92, 238.02891) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "U"
  def category = Category.Actinoids
  def col = 4
  def row = 2
  def block = 'f'
  def appearance = "silvery gray metallic; corrodes to a spalling black oxide coat in air"
  def electronConfiguration = "[Rn] 5f3 6d1 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 21, 9, 2)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-61-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 4, 5, 6))
  override def electronNegativity = Some(1.38)
  override def ionizationEnergies = Some(Map("1st" -> 597.6 * (kJ/mol), "2nd" -> 1420 * (kJ/mol)))
  override def atomicRadius = Some(pm(138.5))
  override def vanDerWaalsRadius = Some(pm(186))
  override def electricalResistivity = Some((0.280 * uOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((27.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((13.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3155 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(208), None)))
  override def shearModulus = Some(List((GPa(111), None)))
  override def bulkModulus = Some(List((GPa(100), None)))
  override def poissonRatio = Some(List((0.23, None)))

  override def density = Some(List((19.1 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (17.3 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1405.3), None))
  override def boilingPoint = Some((K(4404), None))
  override def heatOfFusion = Some((9.14 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((417.1 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 27.665 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
