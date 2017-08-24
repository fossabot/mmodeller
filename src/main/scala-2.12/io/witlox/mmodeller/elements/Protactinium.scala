package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Protactinium extends ChemicalElementBase(91, 231.03588) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Pa"
  def category = Category.Actinoids
  def col = 3
  def row = 2
  def block = 'f'
  def appearance = "bright, silvery metallic luster"
  def electronConfiguration = "[Rn] 7s2 6d1 5f2"
  def electronsPerShell = List(2, 8, 18, 32, 20, 9, 2)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-13-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3, 4, 5))
  override def electronNegativity = Some(1.5)
  override def ionizationEnergies = Some(Map("1st" -> 568* (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def electricalResistivity = Some((177 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((47 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((15.37 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1841), None))
  override def boilingPoint = Some((K(4300), None))
  override def heatOfFusion = Some((12.34 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((481 * (kJ/mol), None, None))
}
