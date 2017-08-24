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

object Calcium extends ChemicalElementBase(20, 40.078) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ca"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 4
  def block = 's'
  def appearance = "dull grey, silver"
  def electronConfiguration = "[Ar] 4s2"
  def electronsPerShell = List(2, 8, 8, 2)
  def crystalStructure = "face centered cubic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-70-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2))
  override def electronNegativity = Some(1.00)
  override def ionizationEnergies = Some(Map("1st" -> 589.8 * (kJ/mol), "2nd" -> 1145.4 * (kJ/mol), "3rd" -> 4912.4 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def atomicRadiusCalc = Some(pm(194))
  override def covalentRadius = Some(pm(174))
  override def electricalResistivity = Some((33.6 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((201 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((22.3 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3810 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(20), None)))
  override def shearModulus = Some(List((GPa(7.4), None)))
  override def bulkModulus = Some(List((GPa(17), None)))
  override def poissonRatio = Some(List((0.31, None)))
  override def mohsHardness = Some(List((1.75, None)))
  override def brinellHardness = Some(List((MPa(167), None)))

  override def density = Some(List((1.55 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (1.378 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1115), None))
  override def boilingPoint = Some((K(1757), None))
  override def heatOfFusion = Some((8.54 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((154.7 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.929 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
