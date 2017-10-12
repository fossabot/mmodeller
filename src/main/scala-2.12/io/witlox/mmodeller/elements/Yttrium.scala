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

object Yttrium extends ChemicalElementBase(39, 88.90585) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Y"
  def category = Category.TransitionMetals
  def group = 3
  def period = 5
  def block = 'd'
  def appearance = "silvery white"
  def electronConfiguration = "[Kr] 4d1 5s2"
  def electronsPerShell = List(2, 8, 18, 9, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-65-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2, 1))
  override def electronNegativity = Some(1.22)
  override def ionizationEnergies = Some(Map("1st" -> 600 * (kJ/mol), "2nd" -> 1180 * (kJ/mol), "3rd" -> 1980 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def atomicRadiusCalc = Some(pm(212))
  override def covalentRadius = Some(pm(162))
  override def electricalResistivity = Some((596 * nOhm*m, None))
  override def thermalConductivity = Some(List((17.2 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((10.6 * (um/m*K), None, Some("α")))

  override def speedOfSound = Some(List((3300 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(63.5), None)))
  override def shearModulus = Some(List((GPa(25.6), None)))
  override def bulkModulus = Some(List((GPa(41.2), None)))
  override def poissonRatio = Some(List((0.243, None)))
  override def brinellHardness = Some(List((MPa(589), None)))

  override def density = Some(List((4.472 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (4.24 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1799), None))
  override def boilingPoint = Some((K(3609), None))
  override def heatOfFusion = Some((11.42 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((365 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.53 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
