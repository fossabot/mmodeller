package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Actinium extends ChemicalElementBase(89, 227.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Ac"
  def category = Category.Actinoids
  def col = 1
  def row = 2
  def block = 'f'
  def appearance = "silvery"
  def electronConfiguration = "[Rn] 6d1 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 18, 9, 2)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "no data"
  def casNumber = "7440-34-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.1)
  override def ionizationEnergies = Some(Map("1st" -> 499 * (kJ/mol), "2nd" -> 1170 * (kJ/mol)))
  override def atomicRadius = Some(pm(195))
  override def thermalConductivity = Some(List((12 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((10 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1323), None))
  override def boilingPoint = Some((K(3471), None))
  override def heatOfFusion = Some((14 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((400 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 27.2 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
