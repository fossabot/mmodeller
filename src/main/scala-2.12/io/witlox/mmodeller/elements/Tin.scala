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

object Tin extends ChemicalElementBase(50, 118.710) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Sn"
  def category = Category.PostTransitionMetals
  def group = 14
  def period = 5
  def block = 'p'
  def appearance = "silvery lustrous gray"
  def electronConfiguration = "[Kr] 4d10 5s2 5p2"
  def electronsPerShell = List(2, 8, 18, 18, 4)
  def crystalStructure = "Tetragonal (white, ß-Tin)"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-31-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 2))
  override def electronNegativity = Some(1.96)
  override def ionizationEnergies = Some(Map("1st" -> 708.6 * (kJ/mol), "2nd" -> 1411.8 * (kJ/mol), "3rd" -> 2943.0 * (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(145))
  override def covalentRadius = Some(pm(141))
  override def vanDerWaalsRadius = Some(pm(217))
  override def electricalResistivity = Some((115 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((66.8 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((22.0 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2730 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(50), None)))
  override def shearModulus = Some(List((GPa(18), None)))
  override def bulkModulus = Some(List((GPa(58), None)))
  override def poissonRatio = Some(List((0.36, None)))
  override def mohsHardness = Some(List((1.5, None)))
  override def brinellHardness = Some(List((MPa(51), None)))

  override def density = Some(List((6.99 * (g/cm3), None, None, None, Some(MaterialState.Liquid)), (7.365 * (g/cm3), None, None, Some("white"), Some(MaterialState.Solid)), (5.769 * (g/cm3), None, None, Some("gray"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(505.08), None))
  override def boilingPoint = Some((K(2875), None))
  override def heatOfFusion = Some((7.03 * (kJ/mol), None, Some("white")))
  override def heatOfVaporization = Some((296.1 * (kJ/mol), None, Some("white")))
  override def specificHeatCapacity = Some(List((27.112 * (J/mol*K), Some(fromCelsius(25)), None,Some("white"))))
}
