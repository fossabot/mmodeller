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

object Ruthenium extends ChemicalElementBase(44, 101.07) with ChemicalGroup with CrystalStructure {
  def symbol = "Ru"
  def category = Category.TransitionMetals
  def group = 8
  def period = 5
  def block = 'd'
  def appearance = "silvery white metallic"
  def electronConfiguration = "[Kr] 4d7 5s1"
  def electronsPerShell = List(2, 8, 18, 15, 1)
  def crystalStructure = "hexagonal"
  def phase = MaterialState.Solid
  def casNumber = "7440-18-8"

  override def oxidationStates = Some(List(8, 6, 4, 3, 2, 1))
  override def electronNegativity = Some(2.3)
  override def ionizationEnergies = Some(Map("1st" -> 710.2* (kJ/mol), "2nd" -> 1620* (kJ/mol), "3rd" -> 2747* (kJ/mol)))
  override def atomicRadius = Some(pm(130))
  override def atomicRadiusCalc = Some(pm(178))
  override def covalentRadius = Some(pm(126))
  override def electricalResistivity = Some((71 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((117 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5970 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(447), None)))
  override def shearModulus = Some(List((GPa(173), None)))
  override def bulkModulus = Some(List((GPa(220), None)))
  override def poissonRatio = Some(List((0.3, None)))
  override def mohsHardness = Some(List((6.5, None)))
  override def brinellHardness = Some(List((MPa(2160), None)))

  override def density = Some(List((12.45 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (10.65 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2607), None))
  override def boilingPoint = Some((K(4423), None))
  override def heatOfFusion = Some((38.59 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((591.6 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.06 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
