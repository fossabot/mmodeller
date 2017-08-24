package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Length.m
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Europium extends ChemicalElementBase(63, 151.964) with Positional with CrystalStructure with MagneticOrdering  {
def symbol = "Eu"
  def category = Category.Lanthanoids
  def col = 7
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f7 6s2"
  def electronsPerShell = List(2, 8, 18, 25, 8, 2)
  def crystalStructure = "simple cubic (body centered)"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-53-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2))
  override def electronNegativity = Some(1.2)
  override def ionizationEnergies = Some(Map("1st" -> 547.1 * (kJ/mol), "2nd" -> 1085 * (kJ/mol), "3rd" -> 2404 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def atomicRadiusCalc = Some(pm(231))
  override def electricalResistivity = Some((0.900 * uOhm*m, None))
  override def thermalConductivity = Some(List((13.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((35.0 * (um/m*K), None, Some("poly")))

  override def youngModulus = Some(List((GPa(18.2), None)))
  override def shearModulus = Some(List((GPa(7.9), None)))
  override def bulkModulus = Some(List((GPa(8.3), None)))
  override def poissonRatio = Some(List((0.152, None)))
  override def vickersHardness = Some(List((MPa(167), None)))

  override def density = Some(List((5.264 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.13 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1099), None))
  override def boilingPoint = Some((K(1802), None))
  override def heatOfFusion = Some((9.21 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((176 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.66 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
