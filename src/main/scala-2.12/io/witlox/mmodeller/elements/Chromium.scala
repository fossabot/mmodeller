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

object Chromium extends ChemicalElementBase(24, 51.9961) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Cr"
  def category = Category.TransitionMetals
  def group = 6
  def period = 4
  def block = 'd'
  def appearance = "silvery metallic"
  def electronConfiguration = "[Ar] 3d5 4s1"
  def electronsPerShell = List(2, 8, 13, 1)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "AFM (rather: SDW)"
  def casNumber = "7440-47-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3, 2, 1))
  override def electronNegativity = Some(1.66)
  override def ionizationEnergies = Some(Map("1st" -> 652.9 * (kJ/mol), "2nd" -> 1590.6 * (kJ/mol), "3rd" -> 2987 * (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(166))
  override def covalentRadius = Some(pm(127))
  override def electricalResistivity = Some((125 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((93.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((4.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5940 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(279), None)))
  override def shearModulus = Some(List((GPa(115), None)))
  override def bulkModulus = Some(List((GPa(160), None)))
  override def poissonRatio = Some(List((0.21, None)))
  override def mohsHardness = Some(List((8.5, None)))
  override def vickersHardness = Some(List((MPa(1060), None)))
  override def brinellHardness = Some(List((MPa(1120), None)))

  override def density = Some(List((7.19 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.3 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2180), None))
  override def boilingPoint = Some((K(2944), None))
  override def heatOfFusion = Some((21.0 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((339.5 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 23.35 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
