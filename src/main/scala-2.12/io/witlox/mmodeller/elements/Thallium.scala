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

object Thallium extends ChemicalElementBase(81, 204.3833) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Tl"
  def category = Category.PostTransitionMetals
  def group = 13
  def period = 6
  def block = 'p'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2 6p1"
  def electronsPerShell = List(2, 8, 18, 32, 18, 3)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-28-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 1))
  override def electronNegativity = Some(1.62)
  override def ionizationEnergies = Some(Map("1st" -> 589.4* (kJ/mol), "2nd" -> 1971* (kJ/mol), "3rd" -> 2878* (kJ/mol)))
  override def atomicRadius = Some(pm(190))
  override def atomicRadiusCalc = Some(pm(156))
  override def covalentRadius = Some(pm(148))
  override def vanDerWaalsRadius = Some(pm(196))
  override def electricalResistivity = Some((0.18 * uOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((46.1 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((29.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((818 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(8), None)))
  override def shearModulus = Some(List((GPa(2.8), None)))
  override def bulkModulus = Some(List((GPa(43), None)))
  override def poissonRatio = Some(List((0.45, None)))
  override def mohsHardness = Some(List((1.2, None)))
  override def brinellHardness = Some(List((MPa(26.4), None)))

  override def density = Some(List((11.85 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (11.22 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(577), None))
  override def boilingPoint = Some((K(1746), None))
  override def heatOfFusion = Some((4.14 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((165 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.32 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
