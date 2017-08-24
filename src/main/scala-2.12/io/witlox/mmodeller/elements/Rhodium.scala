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

object Rhodium extends ChemicalElementBase(45, 102.90550) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Rh"
  def category = Category.TransitionMetals
  def group = 9
  def period = 5
  def block = 'd'
  def appearance = "silvery white metallic"
  def electronConfiguration = "[Kr] 4d8 5s1"
  def electronsPerShell = List(2, 8, 18, 16, 1)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-16-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3, 2, 1))
  override def electronNegativity = Some(2.28)
  override def ionizationEnergies = Some(Map("1st" -> 719.7* (kJ/mol), "2nd" -> 1740* (kJ/mol), "3rd" -> 2997* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(173))
  override def covalentRadius = Some(pm(135))
  override def electricalResistivity = Some((43.3 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((150 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((8.2 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4700 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(380), None)))
  override def shearModulus = Some(List((GPa(150), None)))
  override def bulkModulus = Some(List((GPa(275), None)))
  override def poissonRatio = Some(List((0.26, None)))
  override def mohsHardness = Some(List((6, None)))
  override def vickersHardness = Some(List((MPa(1246), None)))
  override def brinellHardness = Some(List((MPa(1100), None)))

  override def density = Some(List((12.41 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (10.7 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2237), None))
  override def boilingPoint = Some((K(3968), None))
  override def heatOfFusion = Some((26.59 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((494 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.98 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
