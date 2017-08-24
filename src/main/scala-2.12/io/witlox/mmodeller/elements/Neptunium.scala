package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Neptunium extends ChemicalElementBase(93, 237.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Np"
  def category = Category.Actinoids
  def col = 5
  def row = 2
  def block = 'f'
  def appearance = "silvery metallic"
  def electronConfiguration = "[Rn] 5f4 6d1 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 22, 9, 2)
  def crystalStructure = "3 forms: orthorhombic, tetragonal, cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-99-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3))
  override def electronNegativity = Some(1.36)
  override def ionizationEnergies = Some(Map("1st" -> 604.5* (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def electricalResistivity = Some((1.220 * uOhm*m, Some(fromCelsius(22))))
  override def thermalConductivity = Some(List((6.3 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((20.45 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(910), None))
  override def boilingPoint = Some((K(4273), None))
  override def heatOfFusion = Some((3.20 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((336 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((29.46 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
