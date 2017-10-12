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

object Lead extends ChemicalElementBase(82, 207.2) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Pb"
  def category = Category.PostTransitionMetals
  def group = 14
  def period = 6
  def block = 'p'
  def appearance = "bluish gray"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2 6p2"
  def electronsPerShell = List(2, 8, 18, 32, 18, 4)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7439-92-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 2))
  override def electronNegativity = Some(2.33)
  override def ionizationEnergies = Some(Map("1st" -> 715.6 * (kJ/mol), "2nd" -> 1450.5 * (kJ/mol), "3rd" -> 3081.5 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def atomicRadiusCalc = Some(pm(154))
  override def covalentRadius = Some(pm(147))
  override def vanDerWaalsRadius = Some(pm(202))
  override def electricalResistivity = Some((208 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((35.3 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((28.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((1190 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(16), None)))
  override def shearModulus = Some(List((GPa(5.6), None)))
  override def bulkModulus = Some(List((GPa(46), None)))
  override def poissonRatio = Some(List((0.44, None)))
  override def mohsHardness = Some(List((1.5, None)))
  override def brinellHardness = Some(List((MPa(38.3), None)))

  override def density = Some(List((11.34 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (10.66 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(600.61), None))
  override def boilingPoint = Some((K(2022), None))
  override def heatOfFusion = Some((4.77 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((179.5 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.650 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
