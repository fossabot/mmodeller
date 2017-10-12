package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Manganese extends ChemicalElementBase(25, 54.938045) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Mn"
  def category = Category.TransitionMetals
  def group = 7
  def period = 4
  def block = 'd'
  def appearance = "silvery metallic"
  def electronConfiguration = "[Ar] 4s2 3d5"
  def electronsPerShell = List(2, 8, 13, 2)
  def crystalStructure = "cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-96-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(7, 6, 5, 4, 3, 2, 1))
  override def electronNegativity = Some(1.55)
  override def ionizationEnergies = Some(Map("1st" -> 717.3 * (kJ/mol), "2nd" -> 1509.0 * (kJ/mol), "3rd" -> 3248 * (kJ/mol)))
  override def atomicRadius = Some(pm(127))
  override def atomicRadiusCalc = Some(pm(127))
  override def covalentRadius = Some(pm(139))
  override def electricalResistivity = Some((1.44 * uOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((7.81 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((21.7 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5150 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(198), None)))
  override def bulkModulus = Some(List((GPa(120), None)))
  override def mohsHardness = Some(List((6, None)))
  override def brinellHardness = Some(List((MPa(196), None)))

  override def density = Some(List((7.21 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.95 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1519), None))
  override def boilingPoint = Some((K(2334), None))
  override def heatOfFusion = Some((12.91 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((221 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 26.32 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
