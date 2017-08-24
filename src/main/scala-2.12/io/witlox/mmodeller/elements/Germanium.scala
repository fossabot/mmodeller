package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, Ohm, eV}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Germanium extends ChemicalElementBase(32, 72.64) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ge"
  def category = Category.Metalloids
  def group = 14
  def period = 4
  def block = 'p'
  def appearance = "grayish white"
  def electronConfiguration = "[Ar] 3d10 4s2 4p2"
  def electronsPerShell = List(2, 8, 18, 4)
  def crystalStructure = "Diamond cubic"
  def magneticOrdering = "Diamagnetic"
  def casNumber = "7440-56-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3, 2, 1, 0, -1, -2, -3, -4))
  override def electronNegativity = Some(2.01)
  override def ionizationEnergies = Some(Map("1st" -> 762 * (kJ/mol), "2nd" -> 1537.5 * (kJ/mol), "3rd" -> 3302.1 * (kJ/mol)))
  override def atomicRadius = Some(pm(125))
  override def atomicRadiusCalc = Some(pm(125))
  override def covalentRadius = Some(pm(122))
  override def electricalResistivity = Some((1 * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((60.2 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.0 * (um/m*K), Some(fromCelsius(25)), None))
  override def bandGapEnergy = Some((0.67 * eV, K(302), None))

  override def speedOfSound = Some(List((5400 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(103), None)))
  override def shearModulus = Some(List((GPa(41), None)))
  override def bulkModulus = Some(List((GPa(75), None)))
  override def poissonRatio = Some(List((0.26, None)))
  override def mohsHardness = Some(List((6, None)))
  override def vickersHardness = Some(List((MPa, None)))
  override def brinellHardness = Some(List((MPa, None)))

  override def density = Some(List((5.323 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.60 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1211.40), None))
  override def boilingPoint = Some((K(3106), None))
  override def heatOfFusion = Some((36.94 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((334 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((23.222 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
