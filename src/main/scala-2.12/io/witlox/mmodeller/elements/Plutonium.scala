package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Plutonium extends ChemicalElementBase(94, 244.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Pu"
  def category = Category.Actinoids
  def col = 6
  def row = 2
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Rn] 5f6 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 24, 8, 2)
  def crystalStructure = "monoclinic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-07-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3))
  override def electronNegativity = Some(1.28)
  override def ionizationEnergies = Some(Map("1st" -> 584.7* (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def electricalResistivity = Some((1.460 * uOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((6.74 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((46.7 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2260 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(96), None)))
  override def shearModulus = Some(List((GPa(43), None)))
  override def poissonRatio = Some(List((0.21, None)))

  override def density = Some(List((19.816 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (16.63 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(912.5), None))
  override def boilingPoint = Some((K(3505), None))
  override def heatOfFusion = Some((2.82 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((333.5 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((35.5 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
