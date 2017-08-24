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

object Hafnium extends ChemicalElementBase(72, 178.48) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Hf"
  def category = Category.TransitionMetals
  def group = 4
  def period = 6
  def block = 'd'
  def appearance = "steel grey"
  def electronConfiguration = "[Xe] 4f14 5d2 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 10, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-58-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 658.5 * (kJ/mol), "2nd" -> 1440 * (kJ/mol), "3rd" -> 2250 * (kJ/mol)))
  override def atomicRadius = Some(pm(155))
  override def atomicRadiusCalc = Some(pm(208))
  override def covalentRadius = Some(pm(150))
  override def electricalResistivity = Some((331 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((23.0 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((5.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3010 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(78), None)))
  override def shearModulus = Some(List((GPa(30), None)))
  override def bulkModulus = Some(List((GPa(110), None)))
  override def poissonRatio = Some(List((0.37, None)))
  override def mohsHardness = Some(List((5.5, None)))
  override def vickersHardness = Some(List((MPa(1760), None)))
  override def brinellHardness = Some(List((MPa(1700), None)))

  override def density = Some(List((13.31 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (12 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2506), None))
  override def boilingPoint = Some((K(4876), None))
  override def heatOfFusion = Some((27.2 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((571 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.73 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
