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

object Copper extends ChemicalElementBase(29, 63.546) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Cu"
  def category = Category.TransitionMetals
  def group = 11
  def period = 4
  def block = 'd'
  def appearance = "metallic copper"
  def electronConfiguration = "[Ar] 3d10 4s1"
  def electronsPerShell = List(2, 8, 18, 1)
  def crystalStructure = "face centered cubic, 0.3610 nm"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-50-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(+1, +2, +3, +4))
  override def electronNegativity = Some(1.90)
  override def ionizationEnergies = Some(Map("1st" -> 745.5 * (kJ/mol), "2nd" -> 1957.9 * (kJ/mol), "3rd" -> 3555 * (kJ/mol)))
  override def atomicRadius = Some(pm(128))
  override def atomicRadiusCalc = Some(pm(145))
  override def covalentRadius = Some(pm(138))
  override def vanDerWaalsRadius = Some(pm(140))
  override def electricalResistivity = Some((16.78 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((401 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((16.5 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3810 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(128), None)))
  override def shearModulus = Some(List((GPa(48), None)))
  override def bulkModulus = Some(List((GPa(140), None)))
  override def poissonRatio = Some(List((0.34, None)))
  override def mohsHardness = Some(List((3, None)))
  override def vickersHardness = Some(List((MPa(369), None)))
  override def brinellHardness = Some(List((MPa(874), None)))

  override def density = Some(List((8.94 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (8.02 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1357.77), None))
  override def boilingPoint = Some((K(2835), None))
  override def heatOfFusion = Some((13.26 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((300.4 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.440 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
