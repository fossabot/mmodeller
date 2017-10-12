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

object Nickel extends ChemicalElementBase(28, 58.6934) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ni"
  def category = Category.TransitionMetals
  def group = 10
  def period = 4
  def block = 'd'
  def appearance = "lustrous, metallic and silvery with a gold tinge"
  def electronConfiguration = "[Ar] 4s2 3d8"
  def electronsPerShell = List(2, 8, 16, 2)
  def crystalStructure = "face centered cubic, 0.3520 nm"
  def magneticOrdering = "ferromagnetic"
  def casNumber = "7440-02-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3, 2, 1))
  override def electronNegativity = Some(1.91)
  override def ionizationEnergies = Some(Map("1st" -> 737.1 * (kJ/mol), "2nd" -> 1753.0 * (kJ/mol), "3rd" -> 3395 * (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(149))
  override def covalentRadius = Some(pm(121))
  override def vanDerWaalsRadius = Some(pm(163))
  override def electricalResistivity = Some((69.3 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((90.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((13.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4900 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(200), None)))
  override def shearModulus = Some(List((GPa(76), None)))
  override def bulkModulus = Some(List((GPa(180), None)))
  override def poissonRatio = Some(List((0.31, None)))
  override def mohsHardness = Some(List((4, None)))
  override def vickersHardness = Some(List((MPa(638), None)))
  override def brinellHardness = Some(List((MPa(700), None)))

  override def density = Some(List((8.908 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.81 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1728), None))
  override def boilingPoint = Some((K(3186), None))
  override def heatOfFusion = Some((17.48 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((377.5 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 26.07 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
