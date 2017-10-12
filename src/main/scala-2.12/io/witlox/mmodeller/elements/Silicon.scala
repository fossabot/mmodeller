package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, Ohm, eV}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Silicon extends ChemicalElementBase(14, 28.0855) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Si"
  def category = Category.Metalloids
  def group = 14
  def period = 3
  def block = 'p'
  def appearance = "crystalline, reflective, bluish-tinged faces"
  def electronConfiguration = "[Ne] 3s2 3p2"
  def electronsPerShell = List(2, 8, 4)
  def crystalStructure = "Diamond cubic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-21-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3 , 2 , 1))
  override def electronNegativity = Some(1.90)
  override def ionizationEnergies = Some(Map("1st" -> 786.5 * (kJ/mol), "2nd" -> 1577.1 * (kJ/mol), "3rd" -> 3231.6 * (kJ/mol)))
  override def atomicRadius = Some(pm(117.6))
  override def atomicRadiusCalc = Some(pm(111))
  override def covalentRadius = Some(pm(111))
  override def vanDerWaalsRadius = Some(pm(210))
  override def electricalResistivity = Some((103 * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((149 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((2.6 * (um/m*K), Some(fromCelsius(25)), None))
  override def bandGapEnergy = Some((1.12 * eV, K(302), None))

  override def speedOfSound = Some(List((8433 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(185), None)))
  override def shearModulus = Some(List((GPa(52), None)))
  override def bulkModulus = Some(List((GPa(100), None)))
  override def poissonRatio = Some(List((0.28, None)))
  override def mohsHardness = Some(List((7, None)))

  override def density = Some(List((2.3290 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (2.57 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1687), None))
  override def boilingPoint = Some((K(3538), None))
  override def heatOfFusion = Some((50.21 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((359 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 19.789 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
