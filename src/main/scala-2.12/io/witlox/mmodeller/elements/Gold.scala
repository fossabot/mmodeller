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

object Gold extends ChemicalElementBase(79, 196.966569) with ChemicalGroup with CrystalStructure with MagneticOrdering with TensileStrain {
  def symbol = "Au"
  def category = Category.TransitionMetals
  def group = 11
  def period = 6
  def block = 'd'
  def appearance = "metallic yellow"
  def electronConfiguration = "[Xe] 4f14 5d10 6s1"
  def electronsPerShell = List(2, 8, 18, 32, 18, 1)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def tensileStrain = 0.00157
  def casNumber = "7440-57-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(-1, 1, 2, 3, 4, 5))
  override def electronNegativity = Some(2.54)
  override def ionizationEnergies = Some(Map("1st" -> 890.1* (kJ/mol), "2nd" -> 1980* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(174))
  override def covalentRadius = Some(pm(144))
  override def vanDerWaalsRadius = Some(pm(166))
  override def electricalResistivity = Some((22.14 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((318 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((14.2 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2030 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(78), None)))
  override def shearModulus = Some(List((GPa(27), None)))
  override def bulkModulus = Some(List((GPa(180), None)))
  override def poissonRatio = Some(List((0.44, None)))
  override def mohsHardness = Some(List((2.5, None)))
  override def vickersHardness = Some(List((MPa(216), None)))
  override def brinellHardness = Some(List((MPa(2450), None)))

  override def density = Some(List((19.3 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (17.31 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1337.33), None))
  override def boilingPoint = Some((K(3129), None))
  override def heatOfFusion = Some((12.55 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((324 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.418 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
