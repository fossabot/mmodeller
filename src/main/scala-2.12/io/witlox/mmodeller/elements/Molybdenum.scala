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

object Molybdenum extends ChemicalElementBase(42, 95.96) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Mo"
  def category = Category.TransitionMetals
  def group = 6
  def period = 5
  def block = 'd'
  def appearance = "gray metallic"
  def electronConfiguration = "[Kr] 4d5 5s1"
  def electronsPerShell = List(2, 8, 18, 13, 1)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-98-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3, 2, 1))
  override def electronNegativity = Some(2.16)
  override def ionizationEnergies = Some(Map("1st" -> 684.3 * (kJ/mol), "2nd" -> 1560 * (kJ/mol), "3rd" -> 2618 * (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(190))
  override def covalentRadius = Some(pm(145))
  override def electricalResistivity = Some((53.4 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((138 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((4.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5400 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(329), None)))
  override def shearModulus = Some(List((GPa(126), None)))
  override def bulkModulus = Some(List((GPa(230), None)))
  override def poissonRatio = Some(List((0.31, None)))
  override def mohsHardness = Some(List((5.5, None)))
  override def vickersHardness = Some(List((MPa(1530), None)))
  override def brinellHardness = Some(List((MPa(1500), None)))

  override def density = Some(List((10.28 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (9.33 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2896), None))
  override def boilingPoint = Some((K(4912), None))
  override def heatOfFusion = Some((37.48 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((617 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.06 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
