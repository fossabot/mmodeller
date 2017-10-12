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

object Iridium extends ChemicalElementBase(77, 192.217) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ir"
  def category = Category.TransitionMetals
  def group = 9
  def period = 6
  def block = 'd'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f14 5d7 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 15, 2)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-88-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(-3,-1, 0, 1, 2, 3, 4, 5, 6))
  override def electronNegativity = Some(2.20)
  override def ionizationEnergies = Some(Map("1st" -> 880* (kJ/mol), "2nd" -> 1600* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(180))
  override def covalentRadius = Some(pm(137))
  override def electricalResistivity = Some((47.1 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((147 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4825 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(528), None)))
  override def shearModulus = Some(List((GPa(210), None)))
  override def bulkModulus = Some(List((GPa(320), None)))
  override def poissonRatio = Some(List((0.26, None)))
  override def mohsHardness = Some(List((6.5, None)))
  override def vickersHardness = Some(List((MPa(1760), None)))
  override def brinellHardness = Some(List((MPa(1670), None)))

  override def density = Some(List((22.56 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (19 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2739), None))
  override def boilingPoint = Some((K(4701), None))
  override def heatOfFusion = Some((41.12 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((563 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.10 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
