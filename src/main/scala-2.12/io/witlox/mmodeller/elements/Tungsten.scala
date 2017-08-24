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

object Tungsten extends ChemicalElementBase(74, 183.84) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "W"
  def category = Category.TransitionMetals
  def group = 6
  def period = 6
  def block = 'd'
  def appearance = "grayish white, lustrous"
  def electronConfiguration = "[Xe] 4f14 5d4 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 12, 2)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-33-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3, 2, 1, 0, -1))
  override def electronNegativity = Some(2.36)
  override def ionizationEnergies = Some(Map("1st" -> 770* (kJ/mol), "2nd" -> 1700* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def covalentRadius = Some(pm(146))
  override def electricalResistivity = Some((52.8 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((173 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((4.5 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4290 * (m/s), None, None, None)))
  override def shearModulus = Some(List((GPa(161), None)))
  override def bulkModulus = Some(List((GPa(310), None)))
  override def poissonRatio = Some(List((0.28, None)))
  override def mohsHardness = Some(List((7.5, None)))
  override def vickersHardness = Some(List((MPa(3430), None)))
  override def brinellHardness = Some(List((MPa(2570), None)))

  override def density = Some(List((19.25 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (17.6 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(3695), None))
  override def boilingPoint = Some((K(5828), None))
  override def heatOfVaporization = Some((806.7 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.27 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
