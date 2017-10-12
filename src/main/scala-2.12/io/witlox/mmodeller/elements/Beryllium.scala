package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Beryllium extends ChemicalElementBase(4, 9.012182) with ChemicalGroup with CrystalStructure with MagneticOrdering {
  def symbol = "Be"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 2
  def block = 's'
  def appearance = "white-gray metallic"
  def electronConfiguration = "1s2 2s2"
  def electronsPerShell = List(2, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-41-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2, 1))
  override def electronNegativity = Some(1.57)
  override def ionizationEnergies = Some(Map("1st" -> 899.5 * (kJ/mol), "2nd" -> 1757.1 * (kJ/mol), "3rd" -> 14848.7 * (kJ/mol)))
  override def atomicRadius = Some(pm(105))
  override def atomicRadiusCalc = Some(pm(112))
  override def covalentRadius = Some(pm(90))
  override def thermalConductivity = Some(List((200 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11.3 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((12870 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(287), None)))
  override def shearModulus = Some(List((GPa(132), None)))
  override def bulkModulus = Some(List((GPa(130), None)))
  override def poissonRatio = Some(List((0.032, None)))
  override def mohsHardness = Some(List((5.5, None)))
  override def vickersHardness = Some(List((MPa(1670), None)))
  override def brinellHardness = Some(List((MPa(600), None)))

  override def density = Some(List((1.85 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (1.690 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1560), None))
  override def boilingPoint = Some((K(2742), None))
  override def heatOfFusion = Some((7.895 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((297 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 16.443 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
