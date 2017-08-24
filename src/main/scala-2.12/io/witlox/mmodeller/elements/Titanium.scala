package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Titanium extends ChemicalElementBase(22, 47.867) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ti"
  def category = Category.TransitionMetals
  def group = 4
  def period = 4
  def block = 'd'
  def appearance = "silvery grey-white metallic"
  def electronConfiguration = "[Ar] 4s2 3d2"
  def electronsPerShell = List(2, 8, 10, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-32-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3, 2, 1))
  override def electronNegativity = Some(1.54)
  override def ionizationEnergies = Some(Map("1st" -> 658.8 * (kJ/mol), "2nd" -> 1309.8 * (kJ/mol), "3rd" -> 2652.5 * (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(176))
  override def covalentRadius = Some(pm(136))
  override def electricalResistivity = Some((0.420 * uOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((21.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((8.6 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5090 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(116), None)))
  override def shearModulus = Some(List((GPa(44), None)))
  override def bulkModulus = Some(List((GPa(110), None)))
  override def poissonRatio = Some(List((0.32, None)))
  override def mohsHardness = Some(List((6, None)))
  override def vickersHardness = Some(List((MPa(970), None)))
  override def brinellHardness = Some(List((MPa(716), None)))

  override def density = Some(List((4.506 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (4.11 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1941), None))
  override def boilingPoint = Some((K(3560), None))
  override def heatOfFusion = Some((14.15 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((425 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.060 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
